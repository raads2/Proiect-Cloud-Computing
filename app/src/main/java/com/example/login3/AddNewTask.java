package com.example.login3;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FieldValue;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class AddNewTask extends BottomSheetDialogFragment {

    public static final String TAG = "AddNewTask";

    private TextView setDueDate;
    private EditText mTaskEdit;
    private Button mSaveBttn;
    private FirebaseFirestore firestore;
    private Context context;
    private String dueDate = "";
    private String id = "";
    private String dueDateUpdate = "";

    public static AddNewTask newInstance(){
        return new AddNewTask();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.add_new_task, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        setDueDate = view.findViewById(R.id.set_sue_tv);
        mTaskEdit = view.findViewById(R.id.task_edittext);
        mSaveBttn=view.findViewById(R.id.save_bttn);
        firestore=FirebaseFirestore.getInstance();
        context=requireContext();

        boolean isUpdate=false;
        final  Bundle bundle = getArguments();
        if(bundle != null){
            isUpdate=true;
            String task = bundle.getString("task");
            id =bundle.getString("id");
            dueDateUpdate= bundle.getString("due");

            mTaskEdit.setText(task);
            setDueDate.setText(dueDate);

            if(task.length()>0)
            {
                mSaveBttn.setEnabled(false);
                mSaveBttn.setBackgroundColor(Color.GRAY);
            }
        }

        mTaskEdit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {
                if(s.toString().equals("")){
                    mSaveBttn.setEnabled(false);
                    mSaveBttn.setBackgroundColor(Color.GRAY);
                } else{
                    mSaveBttn.setEnabled(true);
                    mSaveBttn.setBackgroundColor(getResources().getColor(R.color.purple_200));

                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        setDueDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar= Calendar.getInstance();

                int MONTH = calendar.get(Calendar.MONTH);
                int YEAR=calendar.get(Calendar.YEAR);
                int DAY = calendar.get(Calendar.DATE);

                DatePickerDialog datePickerDialog = new DatePickerDialog(context, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int dayOfMonth) {
                        month = month+1;
                        setDueDate.setText(dayOfMonth+"/"+month+"/"+year);
                        dueDate=dayOfMonth+"/"+month+"/"+year;
                    }
                }, YEAR, MONTH, DAY);

                datePickerDialog.show();
            }
        });
            boolean finalIsUpdate=isUpdate;
            mSaveBttn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String task=mTaskEdit.getText().toString();

                    if(finalIsUpdate){
                        firestore.collection("task").document(id).update("task", task, "due", dueDate);
                        Toast.makeText(context, "Task Updated", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        if (task.isEmpty()) {
                            Toast.makeText(requireContext(), "Empty task not allowed", Toast.LENGTH_SHORT).show();
                        } else {
                            Map<String, Object> taskMap = new HashMap<>();
                            taskMap.put("task", task);
                            taskMap.put("due", dueDate);
                            taskMap.put("status", 0);
                            taskMap.put("time", FieldValue.serverTimestamp());

                            firestore.collection("task").add(taskMap)
                                    .addOnCompleteListener(taskResult -> {
                                        Log.d("FIREBASE", "onComplete called");
                                        if (taskResult.isSuccessful()) {
                                            Log.d("FIREBASE", "SUCCESS");
                                        } else {
                                            Log.d("FIREBASE", "ERROR: " + taskResult.getException().getMessage());
                                        }
                                    })
                                    .addOnFailureListener(e -> {
                                        Log.e("FIREBASE", "FAILURE: " + e.getMessage());
                                    });
                        }
                    }
                    dismiss();
                }
            });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Override
    public void onDismiss(@NonNull DialogInterface dialog) {
        super.onDismiss(dialog);
        Activity activity=getActivity();
        if(activity instanceof OnDialogCloseListener){
            ((OnDialogCloseListener)activity).onDialogCLose(dialog);
        }
    }
}

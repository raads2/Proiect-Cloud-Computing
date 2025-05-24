package com.example.login3;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.example.login3.databinding.ActivityMain2Binding;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity2 extends BaseActivity {
    private ActivityMain2Binding binding;
    private int adultPassenger = 1, childPassenger = 1;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM, yyyy", Locale.ENGLISH);
    private Calendar calendar = Calendar.getInstance();
    FirebaseAuth auth;
    Button button;
    TextView textView;
    FirebaseUser user;
    FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        FirebaseDatabase database = FirebaseDatabase.getInstance();

        initLocations();
        initPassengers();
        initClassSeat();
        initDatePickup();
        setVariable();
    }

    private void setVariable() {
        binding.searchBtn.setOnClickListener(v -> {
            Location fromLocation = (Location) binding.fromSp.getSelectedItem();
            Location toLocation = (Location) binding.toSp.getSelectedItem();

            if (fromLocation == null || toLocation == null) {
                Toast.makeText(MainActivity2.this, "Please select both locations", Toast.LENGTH_SHORT).show();
                return; // stop here, no crash
            }

            Intent intent = new Intent(MainActivity2.this, SearchActivity.class);
            intent.putExtra("from", fromLocation.getName());
            intent.putExtra("to", toLocation.getName());
            intent.putExtra("date", binding.departureDateTxt.getText().toString());
            intent.putExtra("numPassenger", adultPassenger + childPassenger);
            startActivity(intent);
        });
    }

    private void initDatePickup() {
        Calendar calendarToday = Calendar.getInstance();
        String currentDate = dateFormat.format(calendarToday.getTime());
        binding.departureDateTxt.setText(currentDate);

        Calendar calendarTommorow = Calendar.getInstance();
        calendarTommorow.add(Calendar.DAY_OF_YEAR, 1);
        String tommorowDate = dateFormat.format(calendarTommorow.getTime());

        binding.departureDateTxt.setOnClickListener(v -> showDatePickerDialog(binding.departureDateTxt));
    }

    private void initClassSeat() {
        binding.progressBarClass.setVisibility(View.VISIBLE);
        ArrayList<String> list = new ArrayList<>();
        list.add("Business Class");
        list.add("First Class");
        list.add("Economy Class");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity2.this, R.layout.sp_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.classSp.setAdapter(adapter);
        binding.progressBarClass.setVisibility(View.GONE);
    }

    private void initPassengers() {
        binding.plusAdultBtn.setOnClickListener(v -> {
            adultPassenger++;
            binding.AdultTxt.setText(adultPassenger + " Adult");
        });

        binding.minusAdultBtn.setOnClickListener(v -> {
            if (adultPassenger > 1) {
                adultPassenger--;
                binding.AdultTxt.setText(adultPassenger + " Adult");
            }
        });

        binding.plusChildBtn.setOnClickListener(v -> {
            childPassenger++;
            binding.childTxt.setText(childPassenger + " Child");
        });

        binding.minusChildBtn.setOnClickListener(v -> {
            if (childPassenger > 0) {
                childPassenger--;
                binding.childTxt.setText(childPassenger + " Child");
            }
        });
    }

    private void initLocations() {
        binding.progressBarFrom.setVisibility(View.VISIBLE);
        binding.progressBarTo.setVisibility(View.VISIBLE);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Locations");

        ArrayList<Location> list = new ArrayList<>();
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                System.out.println("Firebase onDataChange called");
                if (snapshot.exists()) {
                    System.out.println("Snapshot exists, children count: " + snapshot.getChildrenCount());
                    list.clear();
                    for (DataSnapshot issue : snapshot.getChildren()) {
                        Location loc = issue.getValue(Location.class);
                        System.out.println("Loaded location: " + loc);
                        if (loc != null) {
                            list.add(loc);
                        }
                    }

                    if (!list.isEmpty()) {
                        System.out.println("Locations loaded: " + list.size());
                        ArrayAdapter<Location> adapter = new ArrayAdapter<>(MainActivity2.this, R.layout.sp_item, list);
                        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                        binding.fromSp.setAdapter(adapter);
                        binding.toSp.setAdapter(adapter);

                        if (list.size() > 1) {
                            binding.fromSp.setSelection(1);
                        } else {
                            binding.fromSp.setSelection(0);
                        }
                    } else {
                        System.out.println("Location list is empty after loading");
                        binding.fromSp.setAdapter(null);
                        binding.toSp.setAdapter(null);
                    }
                } else {
                    System.out.println("Snapshot does not exist");
                    binding.fromSp.setAdapter(null);
                    binding.toSp.setAdapter(null);
                }
                binding.progressBarFrom.setVisibility(View.GONE);
                binding.progressBarTo.setVisibility(View.GONE);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                System.out.println("Firebase onCancelled: " + error.getMessage());
                binding.progressBarFrom.setVisibility(View.GONE);
                binding.progressBarTo.setVisibility(View.GONE);
                Toast.makeText(MainActivity2.this, "Failed to load locations: " + error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }



    private void showDatePickerDialog(TextView textView) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this, (view, selectedYear, selectedMonth, selectedDay) -> {
            calendar.set(selectedYear, selectedMonth, selectedDay);
            String formattedDate = dateFormat.format(calendar.getTime());
            textView.setText(formattedDate);
        }, year, month, day);
        datePickerDialog.show();
    }


}
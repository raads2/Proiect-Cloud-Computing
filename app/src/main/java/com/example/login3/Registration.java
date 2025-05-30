package com.example.login3;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Registration extends AppCompatActivity {

    TextInputEditText editTextEmail, editTextPassword;
    Button buttonReg;
    FirebaseAuth mAuth;
    ProgressBar progressBar;
    TextView textView;

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent= new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
            editTextEmail=findViewById(R.id.email);
            mAuth=FirebaseAuth.getInstance();
            editTextPassword=findViewById(R.id.password);
            buttonReg=findViewById(R.id.btn_register);
            progressBar = findViewById(R.id.progressBar);
            textView=findViewById(R.id.loginNow);
            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), Login.class);
                    startActivity(intent);
                    finish();
                }
            });

            buttonReg.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    progressBar.setVisibility(View.VISIBLE);
                    String email, password;
                    email=editTextEmail.getText().toString();
                    password=editTextPassword.getText().toString();

                    if(TextUtils.isEmpty((email))){
                        Toast.makeText(Registration.this, "Enter email", Toast.LENGTH_SHORT).show();
                    }

                    if(TextUtils.isEmpty((password))){
                        Toast.makeText(Registration.this, "Enter password", Toast.LENGTH_SHORT).show();
                    }

                    mAuth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    progressBar.setVisibility(View.GONE);
                                    if (task.isSuccessful()) {
                                        Toast.makeText(Registration.this, "Account created!",
                                                Toast.LENGTH_SHORT).show();

                                    } else {
                                        // If sign in fails, display a message to the user.
                                        Toast.makeText(Registration.this, "Authentication failed.",
                                                Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });

                }



            });
    }
}
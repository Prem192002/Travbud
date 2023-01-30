package com.example.dbms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity {

    private EditText registration_email;
    private EditText registration_password;
    private Button regis;
    private FirebaseAuth authentication;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registration_email = findViewById(R.id.regemail);
        registration_password = findViewById(R.id.regpassword);
        regis = findViewById(R.id.submit);
        authentication = FirebaseAuth.getInstance();
        regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = registration_email.getText().toString();
                String password = registration_password.getText().toString();

                if(TextUtils.isEmpty(email) || TextUtils.isEmpty(password)){
                    Toast.makeText(register.this,"Enter Email and Password",Toast.LENGTH_SHORT).show();
                }
                else {
                    reg(email,password);
                }
            }
        });
    }

    private void reg(String email, String password){
        authentication.createUserWithEmailAndPassword(email,password).addOnCompleteListener(register.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){
                    Toast.makeText(register.this,"successfully registered",Toast.LENGTH_SHORT).show();
                }
                else{

                    Toast.makeText(register.this,"failed to register",Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}
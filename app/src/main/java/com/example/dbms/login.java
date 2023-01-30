package com.example.dbms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private Button login;

    private Button Register;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editText1 = findViewById(R.id.editTextTextEmailAddress2);
        editText2 = findViewById(R.id.editTextTextPassword2);
        login = findViewById(R.id.button3);
        Register = findViewById(R.id.button2);
        auth = FirebaseAuth.getInstance();

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(login.this, register.class));
            }
        });



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editText1.getText().toString();
                String password = editText2.getText().toString();

                if(TextUtils.isEmpty(email)||TextUtils.isEmpty(password)){
                    Toast.makeText(login.this, "Enter username and password", Toast.LENGTH_SHORT).show();
                }
                else {
                    reg(email,password);
                }
            }
        });
    }

    private void reg(String email, String password){
        auth.signInWithEmailAndPassword(email,password).addOnSuccessListener(login.this, new OnSuccessListener<AuthResult>() {
            @Override
            public void onSuccess(AuthResult authResult) {
                Toast.makeText(login.this,"login success",Toast.LENGTH_SHORT).show();
                startActivity(new Intent(login.this,card.class));

            }
        });
    }
}
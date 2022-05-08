package com.exemple.questionnairecreator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.questionnairecreator.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {
    private static EditText userNameEditText;
    private static EditText emailAddressEditText;
    private static EditText passwordEditText;
    private static EditText passwordConfirmEditText;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        mAuth = FirebaseAuth.getInstance();

        userNameEditText = findViewById(R.id.userNameEditText);
        emailAddressEditText = findViewById(R.id.emailAddressEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        passwordConfirmEditText = findViewById(R.id.passwordConfirmEditText);
    }
//    @Override
//    protected  void onDestroy() {
//        super.onDestroy();
//        mAuth.signOut();
//    }

    public void registration(View view) {
        String userName = userNameEditText.getText().toString();
        String emailAddress = emailAddressEditText.getText().toString();
        String password = passwordEditText.getText().toString();
        String passwordConfirm = passwordConfirmEditText.getText().toString();
        if(!password.equals(passwordConfirm)){
            return;
        }
        mAuth.createUserWithEmailAndPassword(emailAddress, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()) {
                    finish();
                } else {
                    Toast.makeText(RegistrationActivity.this, "User was't created successfully:", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    public void cancel(View view) {
        finish();
    }
}
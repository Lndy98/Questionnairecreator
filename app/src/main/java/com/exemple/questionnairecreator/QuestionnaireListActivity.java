package com.exemple.questionnairecreator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.questionnairecreator.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class QuestionnaireListActivity extends AppCompatActivity {
    private FirebaseUser user;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questionnaire_list);

        mAuth = FirebaseAuth.getInstance();
        user = FirebaseAuth.getInstance().getCurrentUser();

        if(user == null) {
            finish();
        }
    }
}
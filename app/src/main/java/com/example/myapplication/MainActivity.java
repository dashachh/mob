package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.EditText;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    ArrayList<Visitor> allVisitors = new ArrayList<>();
    EditText fioText;
    EditText ageText;
    EditText timeText;
    EditText emailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fioText = findViewById(R.id.editTextFio);
        ageText = findViewById(R.id.editTextAge);
        timeText = findViewById(R.id.editTextTime);
        emailText = findViewById(R.id.editTextEmail);
    }

    public void addNewVisitor(View view) {
        String fio = fioText.getText().toString();
        String age = ageText.getText().toString();
        String time = timeText.getText().toString();
        String email = emailText.getText().toString();
        if (!fio.isEmpty() && !age.isEmpty()  && !time.isEmpty()  && !email.isEmpty() ) {
            Visitor newVisitor = new Visitor();
            newVisitor.setFio(fio);
            newVisitor.setAge(age);
            newVisitor.setTime(time);
            newVisitor.setEmail(email);

            allVisitors.add(newVisitor);
        }
        fioText.setText("");
        ageText.setText("");
        timeText.setText("");
        emailText.setText("");
    }

    public void getAllVisitors(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("visitors", (Serializable) allVisitors);
        startActivity(intent);
    }
}
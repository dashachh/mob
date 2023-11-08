package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Visitor> allVisitors = new ArrayList<>();
    EditText nameText;
    EditText surnameText;
    EditText heightText;
    EditText weightText;
    EditText birthYearText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameText = findViewById(R.id.editTextName);
        surnameText = findViewById(R.id.editTextSurname);
        heightText = findViewById(R.id.editTextHeight);
        weightText = findViewById(R.id.editTextWeight);
        birthYearText = findViewById(R.id.editTextBirthYear);
    }

    public void addNewVisitor(View view) {
        String name = nameText.getText().toString();
        String surname = surnameText.getText().toString();
        String height = heightText.getText().toString();
        String weight = weightText.getText().toString();
        String birthYear = birthYearText.getText().toString();
        if (!name.isEmpty() && !surname.isEmpty()  && !height.isEmpty()  && !weight.isEmpty() && !birthYear.isEmpty()) {
            Visitor newVisitor = new Visitor();
            newVisitor.setName(name);
            newVisitor.setSurname(surname);
            newVisitor.setHeight(Integer.valueOf(height));
            newVisitor.setWeight(Integer.valueOf(weight));
            newVisitor.setBirthYear(Integer.valueOf(birthYear));

            allVisitors.add(newVisitor);
        }
        nameText.setText("");
        surnameText.setText("");
        heightText.setText("");
        weightText.setText("");
        birthYearText.setText("");
    }

    public void getAllVisitors(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("visitors", (Serializable) allVisitors);
        startActivity(intent);
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<Visitor> allVisitors = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView visitorsView = (TextView) findViewById(R.id.visitorsView);
        Intent intent = getIntent();
        ArrayList<Visitor> allVisitors = (ArrayList<Visitor>) intent.getSerializableExtra("visitors");
        if (!allVisitors.isEmpty()) {
            visitorsView.setText(allVisitors.stream().map(Visitor::toString).collect(Collectors.joining("\n")));
        }
    }

    public void onRegisterActivity(View view) {
        finish();
//        Intent intent = new Intent(this, MainActivity.class);
//        startActivity(intent);
    }
}
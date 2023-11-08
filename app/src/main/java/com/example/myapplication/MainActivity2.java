package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MainActivity2 extends AppCompatActivity {

    ArrayList<Visitor> allVisitors = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        allVisitors = (ArrayList<Visitor>) intent.getSerializableExtra("visitors");
    }

    public void onRegisterActivity(View view) {
        finish();
    }

    public void getAllInfo(View view) {
        TextView visitorsView = (TextView) findViewById(R.id.visitorsView);
        if (!allVisitors.isEmpty()) {
            visitorsView.setText(allVisitors.stream().map(Visitor::getAllInfo).collect(Collectors.joining("\n")));
        }
    }

    public void getAgeInfo(View view) {
        TextView visitorsView = (TextView) findViewById(R.id.visitorsView);
        if (!allVisitors.isEmpty()) {
            visitorsView.setText(allVisitors.stream().map(Visitor::getAgeInfo).collect(Collectors.joining("\n")));
        }
    }

    public void getWeightInfo(View view) {
        TextView visitorsView = (TextView) findViewById(R.id.visitorsView);
        if (!allVisitors.isEmpty()) {
            visitorsView.setText(allVisitors.stream().map(Visitor::getWeightInfo).collect(Collectors.joining("\n")));
        }
    }
}
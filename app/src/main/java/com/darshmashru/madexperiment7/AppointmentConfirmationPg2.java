package com.darshmashru.madexperiment7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AppointmentConfirmationPg2 extends AppCompatActivity {
    TextView dateAndTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment_confirmation_pg2);
        dateAndTime = findViewById(R.id.dateAndTime);

        Bundle bundle = getIntent().getExtras();
        String date = bundle.getString("date");
        String time = bundle.getString("time");

        dateAndTime.setText(date + " " + time);
    }
    public void goBack(View view) {
        Intent goback = new Intent(AppointmentConfirmationPg2.this, MainActivity.class);
        startActivity(goback);
    }
}
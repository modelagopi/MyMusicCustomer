package com.example.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Ticket_Booking_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Button booknow;
    Spinner numberoftickets;
    String[] tickets = { "1", "2", "3", "4", "5"};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticket_booking_activity);

        numberoftickets = (Spinner) findViewById(R.id.numberoftickets);
        numberoftickets.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,tickets);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        numberoftickets.setAdapter(aa);


        ImageView imageView1 = findViewById(R.id.profileImageView);
        imageView1.setImageResource(R.drawable.pic3);

        booknow = findViewById(R.id.booknow);
        booknow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Ticket_Booking_Activity.this, PaymentCardDetails.class));
            }
        });

        ImageView imageView47 = findViewById(R.id.imageView47);
        imageView47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

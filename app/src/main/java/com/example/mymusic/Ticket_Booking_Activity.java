package com.example.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Ticket_Booking_Activity extends AppCompatActivity {

    Button booknow;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticket_booking_activity);

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


}

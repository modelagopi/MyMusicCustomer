package com.example.mymusic;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Button_Art_Activity extends AppCompatActivity {

    ImageView chatimage1,chatimage2,chatimage3,chatimage4,chatimage5,imageView47;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_art_activity);
        imageView47= findViewById(R.id.imageView47);
        imageView47.setImageResource(R.drawable.left_arrow_white);
        imageView47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });

        chatimage1 = findViewById(R.id.chatimage1);
        chatimage2 = findViewById(R.id.chatimage2);
        chatimage3 = findViewById(R.id.chatimage3);
        chatimage4 = findViewById(R.id.chatimage4);
        chatimage5 = findViewById(R.id.chatimage5);

        Utils.setCircleImageToImageView(this, chatimage1, R.drawable.artist1, 0, 0);
        Utils.setCircleImageToImageView(this, chatimage2, R.drawable.artist2, 0, 0);
        Utils.setCircleImageToImageView(this, chatimage3, R.drawable.artist3, 0, 0);
        Utils.setCircleImageToImageView(this, chatimage4, R.drawable.artist4, 0, 0);
        Utils.setCircleImageToImageView(this, chatimage5, R.drawable.artist5, 0, 0);
        Utils.setCircleImageToImageView(this, chatimage1, R.drawable.artist1, 0, 0);


    }



}
package com.example.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Chat_Activity extends AppCompatActivity {

    ImageView message1 ,message2 ,message3 ,message4,message5,message6,message7,message8,message9,message10;
    ImageView chatimage1 , chatimage2,chatimage3 ,chatimage4,
             chatimage5,chatimage6, chatimage7,chatimage10,chatimage9,chatimage8,imageView47;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_activity);


        imageView47= findViewById(R.id.imageView47);
        imageView47.setImageResource(R.drawable.left_arrow_white);
        imageView47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
                finish();
            }
        });

        chatimage1 =findViewById(R.id.chatimage1);
        chatimage1.setImageResource(R.drawable.pic3);
        Utils.setCircleImageToImageView(Chat_Activity.this, chatimage1, R.drawable.pic3, 0, 0);

        chatimage2 =findViewById(R.id.chatimage2);
        chatimage2.setImageResource(R.drawable.pic4);
        Utils.setCircleImageToImageView(Chat_Activity.this, chatimage2, R.drawable.pic4, 0, 0);

        chatimage3 =findViewById(R.id.chatimage3);
        chatimage3.setImageResource(R.drawable.pic5);
        Utils.setCircleImageToImageView(Chat_Activity.this, chatimage3, R.drawable.pic5, 0, 0);

        chatimage4 =findViewById(R.id.chatimage4);
        chatimage4.setImageResource(R.drawable.profile1);
        Utils.setCircleImageToImageView(Chat_Activity.this, chatimage4, R.drawable.profile1, 0, 0);

        chatimage5 =findViewById(R.id.chatimage5);
        chatimage5.setImageResource(R.drawable.profile2);
        Utils.setCircleImageToImageView(Chat_Activity.this, chatimage5, R.drawable.profile2, 0, 0);

        chatimage6 =findViewById(R.id.chatimage6);
        chatimage6.setImageResource(R.drawable.pic3);
        Utils.setCircleImageToImageView(Chat_Activity.this, chatimage6, R.drawable.pic3, 0, 0);

        chatimage7 =findViewById(R.id.chatimage7);
        chatimage7.setImageResource(R.drawable.pic4);
        Utils.setCircleImageToImageView(Chat_Activity.this, chatimage7, R.drawable.pic4, 0, 0);

        chatimage8 =findViewById(R.id.chatimage8);
        chatimage8.setImageResource(R.drawable.profile2);
        Utils.setCircleImageToImageView(Chat_Activity.this, chatimage8, R.drawable.profile2, 0, 0);

        chatimage9 =findViewById(R.id.chatimage9);
        chatimage9.setImageResource(R.drawable.pic3);
        Utils.setCircleImageToImageView(Chat_Activity.this, chatimage9, R.drawable.pic3, 0, 0);

        chatimage10 =findViewById(R.id.chatimage10);
        chatimage10.setImageResource(R.drawable.pic4);
        Utils.setCircleImageToImageView(Chat_Activity.this, chatimage10, R.drawable.pic4, 0, 0);


        message1 = findViewById(R.id.message1);
        message1.setImageResource(R.drawable.baseline_chatbubble_orange_24);


        message1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chat_Activity.this, MessageFabActivity.class);
                startActivity(intent);
            }
        });

        message2 = findViewById(R.id.message2);
        message2.setImageResource(R.drawable.baseline_chatbubble_orange_24);
        message2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chat_Activity.this, MessageFabActivity.class);
                startActivity(intent);
            }
        });

        message3 = findViewById(R.id.message3);
        message3.setImageResource(R.drawable.baseline_chatbubble_orange_24);
        message3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chat_Activity.this, MessageFabActivity.class);
                startActivity(intent);
            }
        });

        message4 = findViewById(R.id.message4);
        message4.setImageResource(R.drawable.baseline_chatbubble_orange_24);

        message4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chat_Activity.this, MessageFabActivity.class);
                startActivity(intent);
            }
        });

        message5 = findViewById(R.id.message5);
        message5.setImageResource(R.drawable.baseline_chatbubble_orange_24);

        message5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chat_Activity.this, MessageFabActivity.class);
                startActivity(intent);
            }
        });
        message6 = findViewById(R.id.message6);
        message6.setImageResource(R.drawable.baseline_chatbubble_orange_24);

        message6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chat_Activity.this, MessageFabActivity.class);
                startActivity(intent);
            }
        });
        message7 = findViewById(R.id.message7);
        message7.setImageResource(R.drawable.baseline_chatbubble_orange_24);

        message7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chat_Activity.this, MessageFabActivity.class);
                startActivity(intent);
            }
        });
        message8 = findViewById(R.id.message8);
        message8.setImageResource(R.drawable.baseline_chatbubble_orange_24);

        message8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chat_Activity.this, MessageFabActivity.class);
                startActivity(intent);
            }
        });
        message9 = findViewById(R.id.message9);
        message9.setImageResource(R.drawable.baseline_chatbubble_orange_24);

        message9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chat_Activity.this, MessageFabActivity.class);
                startActivity(intent);
            }
        });
        message10 = findViewById(R.id.message10);
        message10.setImageResource(R.drawable.baseline_chatbubble_orange_24);

        message10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Chat_Activity.this, MessageFabActivity.class);
                startActivity(intent);
            }
        });










    }


}

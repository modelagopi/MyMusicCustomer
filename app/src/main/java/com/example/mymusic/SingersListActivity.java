package com.example.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.mymusic.adapter.ViewPagerAdapter;
import com.example.mymusic.fragment.Top_Arts_Fragment;
import com.example.mymusic.fragment.Top_BookWrite_Fragment;
import com.example.mymusic.fragment.Top_Magic_Fragment;
import com.example.mymusic.fragment.Top_Music_Fragment;
import com.example.mymusic.fragment.Top_Personal_Fragment;
import com.google.android.material.tabs.TabLayout;

public class SingersListActivity extends AppCompatActivity {

   // ImageView coachesback;
    LinearLayout clist_1,clist_2,clist_3,clist_4,clist_5,clist_6,clist_7,clist_8,clist_9,clist_10;
    Button button1,button2,button3,button4,button5;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singers_list_activity);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingersListActivity.this,Button_Music_Activity.class);
                startActivity(intent);
            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingersListActivity.this,Button_Art_Activity.class);
                startActivity(intent);
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SingersListActivity.this,Buton_Magic_activity.class);
                startActivity(intent);
            }
        });

        InitUI();
    }



    public void InitUI(){

       // coachesback = (ImageView) findViewById(R.id.back_clist);

        clist_1 = (LinearLayout) findViewById(R.id.clist_1);
        clist_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingersListActivity.this,HomeEventsActivity.class));
            }
        });


        clist_2 = (LinearLayout) findViewById(R.id.clist_2);
        clist_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingersListActivity.this,HomeEventsActivity.class));
            }
        });
        clist_3 = (LinearLayout) findViewById(R.id.clist_3);
        clist_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingersListActivity.this,HomeEventsActivity.class));
            }
        });
        clist_4 = (LinearLayout) findViewById(R.id.clist_4);
        clist_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingersListActivity.this,HomeEventsActivity.class));
            }
        });
        clist_5 = (LinearLayout) findViewById(R.id.clist_5);
        clist_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingersListActivity.this,HomeEventsActivity.class));
            }
        });
        clist_6 = (LinearLayout) findViewById(R.id.clist_6);
        clist_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingersListActivity.this,HomeEventsActivity.class));
            }
        });
        clist_7 = (LinearLayout) findViewById(R.id.clist_7);
        clist_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingersListActivity.this,HomeEventsActivity.class));
            }
        });
        clist_8 = (LinearLayout) findViewById(R.id.clist_8);
        clist_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingersListActivity.this,HomeEventsActivity.class));
            }
        });
        clist_9 = (LinearLayout) findViewById(R.id.clist_9);
        clist_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingersListActivity.this,HomeEventsActivity.class));
            }
        });
        clist_10 = (LinearLayout) findViewById(R.id.clist_10);
        clist_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingersListActivity.this,HomeEventsActivity.class));
            }
        });

        ImageView imageView1 = findViewById(R.id.chatimage1);
        Utils.setCircleImageToImageView(this, imageView1, R.drawable.pic3, 0, 0);

        ImageView imageView2 = findViewById(R.id.chatimage2);
        Utils.setCircleImageToImageView(this, imageView2, R.drawable.pic4, 0, 0);

        ImageView imageView3 = findViewById(R.id.chatimage3);
        Utils.setCircleImageToImageView(this, imageView3, R.drawable.pic5, 0, 0);

        ImageView imageView4 = findViewById(R.id.chatimage4);
        Utils.setCircleImageToImageView(this, imageView4, R.drawable.profile1, 0, 0);

        ImageView imageView5 = findViewById(R.id.chatimage5);
        Utils.setCircleImageToImageView(this, imageView5, R.drawable.profile2, 0, 0);

        ImageView imageView6 = findViewById(R.id.chatimage6);
        Utils.setCircleImageToImageView(this, imageView6, R.drawable.pic3, 0, 0);

        ImageView imageView7 = findViewById(R.id.chatimage7);
        Utils.setCircleImageToImageView(this, imageView7, R.drawable.profile2, 0, 0);

        ImageView imageView8 = findViewById(R.id.chatimage8);
        Utils.setCircleImageToImageView(this, imageView8, R.drawable.pic3, 0, 0);

        ImageView imageView9 = findViewById(R.id.chatimage9);
        Utils.setCircleImageToImageView(this, imageView9, R.drawable.pic4, 0, 0);

        ImageView imageView10 = findViewById(R.id.chatimage10);
        Utils.setCircleImageToImageView(this, imageView10, R.drawable.pic5, 0, 0);

    }
}

package com.example.mymusic;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigationActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bottomnavigation_activity);

        initUI();
    }
    private  void initUI()
    {
        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener( ( @NonNull
                                                                            MenuItem item)->{
            switch (item.getItemId()) {
                case R.id.Landing:
                    Toast.makeText(getApplicationContext(), "Landing Page is selected.",
                            Toast.LENGTH_LONG).show();
                    break;
                case R.id.masg:
                    Toast.makeText(getApplicationContext(), "Message Menu is selected.",
                            Toast.LENGTH_LONG).show();
                    break;
                case R.id.calender:
                    Toast.makeText(getApplicationContext(), "Calender Menu is selected.",
                            Toast.LENGTH_LONG).show();
                    break;
                case R.id.Profile:
                    Toast.makeText(getApplicationContext(), "Profile Menu is selected.",
                            Toast.LENGTH_LONG).show();
                    break;
            }
            return false;
        });
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


}

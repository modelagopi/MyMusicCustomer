package com.example.mymusic;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.mymusic.adapter.ViewPagerAdapter;
import com.example.mymusic.fragment.Calls_Completed_Fragment;
import com.example.mymusic.fragment.Calls_Upcomming_Fragment;
import com.google.android.material.tabs.TabLayout;

public class Calls extends AppCompatActivity {

    ImageView chatimage1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calls);

        chatimage1 = findViewById(R.id.chatimage1);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });


        ViewPager viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        tabLayout.setupWithViewPager(viewPager);

        Toolbar toolbar = findViewById(R.id.toolbar);
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        Calls_Upcomming_Fragment callsFragment = new Calls_Upcomming_Fragment();
        adapter.addFragment(callsFragment, "Upcomming");

        Calls_Completed_Fragment callsCompletedFragment = new Calls_Completed_Fragment();
        adapter.addFragment(callsCompletedFragment, "Completed");

        viewPager.setAdapter(adapter);
    }

}

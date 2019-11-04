package com.example.mymusic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.mymusic.adapter.ViewPagerAdapter;
import com.example.mymusic.fragment.BrowserFragment;
import com.example.mymusic.fragment.HiredFragment;
import com.example.mymusic.fragment.SavedFragment;
import com.example.mymusic.fragment.Top_Acadamic_Fragment;
import com.example.mymusic.fragment.Top_Business_Fragment;
import com.example.mymusic.fragment.Top_Carrier_Fragment;
import com.example.mymusic.fragment.Top_Family_Fragment;
import com.example.mymusic.fragment.Top_Health_Fragment;
import com.example.mymusic.fragment.Top_Relationship_Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener((@NonNull MenuItem item) -> {
            switch (item.getItemId()) {

                case R.id.home_landing:
                    startActivity(new Intent(MainActivity.this,MainActivity.class));
                    break;
                case R.id.Landing:
                    startActivity(new Intent(MainActivity.this, SingersListActivity.class));
                    break;
                case R.id.masg:
                    startActivity(new Intent(MainActivity.this, Chat_Activity.class));

                    break;
                case R.id.calender:
                    startActivity(new Intent(MainActivity.this,Calls.class));
                    break;
                case R.id.Profile:
                    startActivity(new Intent(MainActivity.this,ProfileActivity.class));
                    break;
            }
            return false;
        });


        /*Bootom Fragment of the page */
        ViewPager viewPager = findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

        Toolbar toolbar = findViewById(R.id.toolbar);

        /*Top_Fragment of the page */

        ViewPager viewP = findViewById(R.id.viewPager2);
        setupViewPag(viewP);

        TabLayout tabLayou = findViewById(R.id.tabLayout1);
        tabLayou.setupWithViewPager(viewP);




    }


/*Bootom Fragment of the page */

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        BrowserFragment BrowserFragment = new BrowserFragment();
        adapter.addFragment(BrowserFragment, "Browse");

        SavedFragment SavedFragment = new SavedFragment();
        adapter.addFragment(SavedFragment, "Saved");

        HiredFragment HiredFragment = new HiredFragment();
        adapter.addFragment(HiredFragment, "Hired");


        viewPager.setAdapter(adapter);
    }

    /*Top_Fragment of the page */
    private void setupViewPag(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

   /*     BrowserFragment BrowserFragment = new BrowserFragment();
        adapter.addFragment(BrowserFragment, "Browser");

        SavedFragment SavedFragment = new SavedFragment();
        adapter.addFragment(SavedFragment, "Saved");

        HiredFragment HiredFragment = new HiredFragment();
        adapter.addFragment(HiredFragment, "Hired");*/


        Top_Business_Fragment HiredFragmen = new Top_Business_Fragment();
        adapter.addFragment(HiredFragmen, "Events");

        Top_Relationship_Fragment HiredFragme = new Top_Relationship_Fragment();
        adapter.addFragment(HiredFragme, "Music");

        Top_Health_Fragment HiredFragm = new Top_Health_Fragment();
        adapter.addFragment(HiredFragm, "Regalia");

        Top_Carrier_Fragment tab4 = new Top_Carrier_Fragment();
        adapter.addFragment(tab4, "Profile");

        Top_Acadamic_Fragment tab5 = new Top_Acadamic_Fragment();
        adapter.addFragment(tab5, "Sold Items");

        Top_Family_Fragment tab6 = new Top_Family_Fragment();
        adapter.addFragment(tab6, "Family");


        viewPager.setAdapter(adapter);
    }




}

package com.example.mymusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.example.mymusic.adapter.ViewPagerAdapter;
import com.example.mymusic.fragment.BrowserFragment;
import com.example.mymusic.fragment.TaggedFragment;
import com.example.mymusic.fragment.Top_Magic_Fragment;
import com.example.mymusic.fragment.Top_Music_Fragment;
import com.example.mymusic.fragment.Top_Personal_Fragment;
import com.example.mymusic.fragment.Top_BookWrite_Fragment;
import com.example.mymusic.fragment.Top_Arts_Fragment;
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
                    startActivity(new Intent(MainActivity.this, MainActivity.class));
                    break;
                case R.id.Landing:
                    startActivity(new Intent(MainActivity.this, SingersListActivity.class));
                    break;
                case R.id.masg:
                    startActivity(new Intent(MainActivity.this, Chat_Activity.class));

                    break;
                case R.id.calender:
                    startActivity(new Intent(MainActivity.this, Calls.class));
                    break;
                case R.id.Profile:
                    startActivity(new Intent(MainActivity.this, ProfileActivity.class));
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

        TaggedFragment SavedFragment = new TaggedFragment();
        adapter.addFragment(SavedFragment, "Tagged");

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


        Top_Music_Fragment HiredFragmen = new Top_Music_Fragment();
        adapter.addFragment(HiredFragmen, "Music");

        Top_Arts_Fragment HiredFragme = new Top_Arts_Fragment();
        adapter.addFragment(HiredFragme, "Arts");

        Top_BookWrite_Fragment HiredFragm = new Top_BookWrite_Fragment();
        adapter.addFragment(HiredFragm, "Book Writers");

        Top_Personal_Fragment tab4 = new Top_Personal_Fragment();
        adapter.addFragment(tab4, "Personal Development");

        Top_Magic_Fragment tab5 = new Top_Magic_Fragment();
        adapter.addFragment(tab5, "Magic");

        /*Top_Family_Fragment tab6 = new Top_Family_Fragment();
        adapter.addFragment(tab6, "Family");*/


        viewPager.setAdapter(adapter);
    }




}

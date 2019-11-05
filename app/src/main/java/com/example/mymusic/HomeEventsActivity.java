package com.example.mymusic;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymusic.adapter.HomeEventsAdapter;
import com.example.mymusic.object.DirectoryHome7Category;
import com.example.mymusic.repository.DirectoryHome7Repository;

import java.util.ArrayList;

public class HomeEventsActivity extends AppCompatActivity {

    private ArrayList<DirectoryHome7Category> catArrayList;
    private HomeEventsAdapter mAdapter;
    private RecyclerView recyclerView;
    int numberOfColumns = 3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        initData();

        initUI();

        initDataBinding();

        initActions();
    }
    private void initData()
    {

        catArrayList = DirectoryHome7Repository.getCategoryList();

    }
    private void initUI() {

       // initToolbar();

        mAdapter = new HomeEventsAdapter(catArrayList);

        // get RecyclerView and bind
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this, numberOfColumns));
        recyclerView.setItemAnimator(new DefaultItemAnimator());


    }
    private void initDataBinding() {
        // get data and adapter
        recyclerView.setAdapter(mAdapter);
    }

    private void initActions()
    {

       /* mAdapter.setOnItemClickListener((view, obj, position) -> Toast.makeText(this , "Selected : " + obj.name , Toast.LENGTH_LONG).show());*/
    }





}

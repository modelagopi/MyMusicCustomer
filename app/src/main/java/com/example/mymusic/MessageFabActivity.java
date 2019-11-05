package com.example.mymusic;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymusic.adapter.FeatureChatGeneralChat2Adapter;
import com.example.mymusic.object.ChatDetailsVO;
import com.example.mymusic.repository.GeneralChatDetailsListRepository;

import java.util.List;

public class MessageFabActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    List<ChatDetailsVO> chatDetailsList;
    FeatureChatGeneralChat2Adapter chatDetailsAdapter;

    RecyclerView rvChatDetails;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.msg_fab_action);

        initData();

        initUI();

        initDataBindings();

        initActions();
    }

    private void initData() {
        chatDetailsList = GeneralChatDetailsListRepository.getGeneralChatDetailsList();
    }
    private void initUI() {
       // initToolbar();

        //get list adapter
        chatDetailsAdapter = new FeatureChatGeneralChat2Adapter(chatDetailsList);

        //get recycler view
        rvChatDetails = findViewById(R.id.rv_chat_details);

        RecyclerView.LayoutManager mLayoutManger = new LinearLayoutManager(getApplicationContext());
        rvChatDetails.setLayoutManager(mLayoutManger);

        rvChatDetails.setAdapter(chatDetailsAdapter);

    }
    private void initDataBindings() {

    }

    private void initActions() {

    }





    @Override
    public void onClick(View view) {


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

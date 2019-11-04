package com.example.mymusic.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.mymusic.MessageFabActivity;
import com.example.mymusic.R;
import com.example.mymusic.Utils;

public class Chat_Message_Fragment extends Fragment {

    public Chat_Message_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.chat_message_fragment, container, false);

        initUI(view);

        return view;


    }

    private void initUI(View view){

        ImageView message1 = view.findViewById(R.id.message1);
        message1.setImageResource(R.drawable.baseline_chatbubble_orange_24);


        message1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), MessageFabActivity.class));


            }
        });
        ImageView message2 = view.findViewById(R.id.message2);
        message2.setImageResource(R.drawable.baseline_chatbubble_orange_24);
        message2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MessageFabActivity.class));


            }
        });
        ImageView message3 = view.findViewById(R.id.message3);
        message3.setImageResource(R.drawable.baseline_chatbubble_orange_24);
        message3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MessageFabActivity.class));


            }
        });
        ImageView message4 = view.findViewById(R.id.message4);
        message4.setImageResource(R.drawable.baseline_chatbubble_orange_24);
        message4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MessageFabActivity.class));


            }
        });
        ImageView message5 = view.findViewById(R.id.message5);
        message5.setImageResource(R.drawable.baseline_chatbubble_orange_24);
        message5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MessageFabActivity.class));


            }
        });
        ImageView message6 = view.findViewById(R.id.message6);
        message6.setImageResource(R.drawable.baseline_chatbubble_orange_24);
        message6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MessageFabActivity.class));


            }
        });
        ImageView message7 = view.findViewById(R.id.message7);
        message7.setImageResource(R.drawable.baseline_chatbubble_orange_24);
        message7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MessageFabActivity.class));


            }
        });
        ImageView message8 = view.findViewById(R.id.message8);
        message8.setImageResource(R.drawable.baseline_chatbubble_orange_24);
        message8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MessageFabActivity.class));

            }
        });
        ImageView message9 = view.findViewById(R.id.message9);
        message9.setImageResource(R.drawable.baseline_chatbubble_orange_24);
        message9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MessageFabActivity.class));

            }
        });
        ImageView message10 = view.findViewById(R.id.message10);
        message10.setImageResource(R.drawable.baseline_chatbubble_orange_24);
        message10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MessageFabActivity.class));


            }
        });


/*
        FloatingActionButton fab = view.findViewById(R.id.msgfab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),MessageFabActivity.class);
                startActivity(intent);
            }
        });
*/


        ImageView imageView1 = view.findViewById(R.id.chatimage1);
        Utils.setCircleImageToImageView(getActivity(), imageView1, R.drawable.pic3, 0, 0);

        ImageView imageView2 = view.findViewById(R.id.chatimage2);
        Utils.setCircleImageToImageView(getActivity(), imageView2, R.drawable.pic4, 0, 0);

        ImageView imageView3 = view.findViewById(R.id.chatimage3);
        Utils.setCircleImageToImageView(getActivity(), imageView3, R.drawable.pic5, 0, 0);

        ImageView imageView4 = view.findViewById(R.id.chatimage4);
        Utils.setCircleImageToImageView(getActivity(), imageView4, R.drawable.profile1, 0, 0);

        ImageView imageView5 = view.findViewById(R.id.chatimage5);
        Utils.setCircleImageToImageView(getActivity(), imageView5, R.drawable.profile2, 0, 0);

        ImageView imageView6 = view.findViewById(R.id.chatimage6);
        Utils.setCircleImageToImageView(getActivity(), imageView6, R.drawable.pic3, 0, 0);

        ImageView imageView7 = view.findViewById(R.id.chatimage7);
        Utils.setCircleImageToImageView(getActivity(), imageView7, R.drawable.profile2, 0, 0);

        ImageView imageView8 = view.findViewById(R.id.chatimage8);
        Utils.setCircleImageToImageView(getActivity(), imageView8, R.drawable.pic3, 0, 0);

        ImageView imageView9 = view.findViewById(R.id.chatimage9);
        Utils.setCircleImageToImageView(getActivity(), imageView9, R.drawable.pic4, 0, 0);

        ImageView imageView10 = view.findViewById(R.id.chatimage10);
        Utils.setCircleImageToImageView(getActivity(), imageView10, R.drawable.pic5, 0, 0);


    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}

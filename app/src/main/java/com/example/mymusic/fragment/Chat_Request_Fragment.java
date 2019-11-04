package com.example.mymusic.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.mymusic.MsgReqFabActivity;
import com.example.mymusic.R;
import com.example.mymusic.Utils;

public class Chat_Request_Fragment extends Fragment {

    public Chat_Request_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.chat_request_fragment, container, false);

//        FloatingActionButton fab = view.findViewById(R.id.msgreqfab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                Intent intent = new Intent(getActivity(),MsgReqFabActivity.class);
//                startActivity(intent);
//
//
//            }
//        });


        initUI(view);

        return view;


    }

    private void initUI(View view){
        ImageView bookacall_1 = view.findViewById(R.id.bookacall_1);
        bookacall_1.setImageResource(R.drawable.calendarrr);
        bookacall_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), MsgReqFabActivity.class));

            }
        });
        ImageView bookacall_2 = view.findViewById(R.id.bookacall_2);
        bookacall_2.setImageResource(R.drawable.calendarrr);
        bookacall_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MsgReqFabActivity.class));

            }
        });
        ImageView bookacall_3 = view.findViewById(R.id.bookacall_3);
        bookacall_3.setImageResource(R.drawable.calendarrr);
        bookacall_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MsgReqFabActivity.class));

            }
        });
        ImageView bookacall_4 = view.findViewById(R.id.bookacall_4);
        bookacall_4.setImageResource(R.drawable.calendarrr);
        bookacall_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MsgReqFabActivity.class));

            }
        });
        ImageView bookacall_5= view.findViewById(R.id.bookacall_5);
        bookacall_5.setImageResource(R.drawable.calendarrr);
        bookacall_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MsgReqFabActivity.class));

            }
        });
        ImageView bookacall_6 = view.findViewById(R.id.bookacall_6);
        bookacall_6.setImageResource(R.drawable.calendarrr);
        bookacall_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MsgReqFabActivity.class));

            }
        });
        ImageView bookacall_7= view.findViewById(R.id.bookacall_7);
        bookacall_7.setImageResource(R.drawable.calendarrr);
        bookacall_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MsgReqFabActivity.class));

            }
        });
        ImageView bookacall_8 = view.findViewById(R.id.bookacall_8);
        bookacall_8.setImageResource(R.drawable.calendarrr);
        bookacall_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MsgReqFabActivity.class));

            }
        });
        ImageView bookacall_9 = view.findViewById(R.id.bookacall_9);
        bookacall_9.setImageResource(R.drawable.calendarrr);
        bookacall_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MsgReqFabActivity.class));

            }
        });
        ImageView bookacall_10 = view.findViewById(R.id.bookacall_10);
        bookacall_10.setImageResource(R.drawable.calendarrr);
        bookacall_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MsgReqFabActivity.class));

            }
        });


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

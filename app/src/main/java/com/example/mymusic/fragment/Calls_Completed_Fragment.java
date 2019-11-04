package com.example.mymusic.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.example.mymusic.BookACall;
import com.example.mymusic.R;
import com.example.mymusic.Utils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Calls_Completed_Fragment extends Fragment {

    public Calls_Completed_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.calls_completed_fragment, container, false);

      /*  FloatingActionButton fab = view.findViewById(R.id.callscompletedfab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), BookACall.class);
                startActivity(intent);

            }
        });*/


        initUI(view);

        return view;


    }

    private void initUI(View view){

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

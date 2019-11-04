package com.example.mymusic.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.mymusic.BookACall;
import com.example.mymusic.R;
import com.example.mymusic.Utils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Calls_Upcomming_Fragment extends Fragment {

    Context context;

    public Calls_Upcomming_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.calls_upcomming_fragemnt, container, false);

        FloatingActionButton fab = view.findViewById(R.id.callsfab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getActivity(), BookACall.class);
                startActivity(intent);

            }
        });

        initUI(view);

        return view;


    }



    private void initUI(View view){


        ImageView edit1 = view.findViewById(R.id.edit1);
        ImageView delete1 = view.findViewById(R.id.delete1);
        edit1.setImageResource(R.drawable.edit);
        delete1.setImageResource(R.drawable.delete);
        ImageView edit2 = view.findViewById(R.id.edit2);
        ImageView delete2 = view.findViewById(R.id.delete2);
        edit2.setImageResource(R.drawable.edit);
        delete2.setImageResource(R.drawable.delete);
        ImageView edit3 = view.findViewById(R.id.edit3);
        ImageView delete3 = view.findViewById(R.id.delete3);
        edit3.setImageResource(R.drawable.edit);
        delete3.setImageResource(R.drawable.delete);
        ImageView edit4 = view.findViewById(R.id.edit4);
        ImageView delete4 = view.findViewById(R.id.delete4);
        edit4.setImageResource(R.drawable.edit);
        delete4.setImageResource(R.drawable.delete);
        ImageView edit5 = view.findViewById(R.id.edit5);
        ImageView delete5 = view.findViewById(R.id.delete5);
        edit5.setImageResource(R.drawable.edit);
        delete5.setImageResource(R.drawable.delete);
        ImageView edit6 = view.findViewById(R.id.edit6);
        ImageView delete6 = view.findViewById(R.id.delete6);
        edit6.setImageResource(R.drawable.edit);
        delete6.setImageResource(R.drawable.delete);

        ImageView edit7 = view.findViewById(R.id.edit7);
        ImageView delete7 = view.findViewById(R.id.delete7);
        edit7.setImageResource(R.drawable.edit);
        delete7.setImageResource(R.drawable.delete);

        ImageView edit8 = view.findViewById(R.id.edit8);
        ImageView delete8 = view.findViewById(R.id.delete8);
        edit8.setImageResource(R.drawable.edit);
        delete8.setImageResource(R.drawable.delete);
        ImageView edit9 = view.findViewById(R.id.edit9);
        ImageView delete9 = view.findViewById(R.id.delete9);
        edit9.setImageResource(R.drawable.edit);
        delete9.setImageResource(R.drawable.delete);
        ImageView edit10 = view.findViewById(R.id.edit10);
        ImageView delete10 = view.findViewById(R.id.delete10);
        edit10.setImageResource(R.drawable.edit);
        delete10.setImageResource(R.drawable.delete);



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

    public void doMyThing(){

        Toast.makeText(context,"Messages Fab Clicked ",Toast.LENGTH_LONG).show();


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

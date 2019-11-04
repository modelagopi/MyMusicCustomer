package com.example.mymusic.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

//import com.example.mymusic.HomeEventsActivity;
import com.example.mymusic.MessageFabActivity;
import com.example.mymusic.MsgReqFabActivity;
import com.example.mymusic.ProfileActivity;
import com.example.mymusic.R;
import com.example.mymusic.SingersListActivity;
import com.example.mymusic.Utils;

public class BrowserFragment extends Fragment {

    ImageView message_1,bookacall_1 ,imageView1;

    Context context;

    public BrowserFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.main_fragment, container, false);

        initUI(view);

        return view;


    }


    private void initUI(View view){

        ImageView filter = view.findViewById(R.id.filter);

        imageView1 = view.findViewById(R.id.imageView1);


        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleArrow(view);
                Toast.makeText(getContext(),"Filter Clicked",Toast.LENGTH_LONG).show();

            }
        });


        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(),HomeEventsActivity.class);
//                startActivity(intent);
            }
        });

     /*   ImageView message_1 = view.findViewById(R.id.message_1);
        message_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MessageFabActivity.class));


            }
        });


        ImageView bookacall_1 = view.findViewById(R.id.bookacall_1);
        bookacall_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), MsgReqFabActivity.class));

            }
        });
        ImageView message_2 = view.findViewById(R.id.message_2);
        message_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), MessageFabActivity.class));


            }
        });

        ImageView bookacall_2 = view.findViewById(R.id.bookacall_2);
        bookacall_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MsgReqFabActivity.class));

            }
        });
        ImageView message_3 = view.findViewById(R.id.message_3);
        message_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MessageFabActivity.class));


            }
        });


        ImageView bookacall_3 = view.findViewById(R.id.bookacall_3);
        bookacall_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MsgReqFabActivity.class));

            }
        });

        ImageView message_4 = view.findViewById(R.id.message_4);
        message_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MessageFabActivity.class));


            }
        });


        ImageView bookacall_4 = view.findViewById(R.id.bookacall_4);
        bookacall_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MsgReqFabActivity.class));

            }
        });


        ImageView message_5 = view.findViewById(R.id.message_5);
        message_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MessageFabActivity.class));


            }
        });


        ImageView bookacall_5 = view.findViewById(R.id.bookacall_5);
        bookacall_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),MsgReqFabActivity.class));

            }
        });*/


        ImageView imageView1 = view.findViewById(R.id.imageView1);

        Utils.setCircleImageToImageView(getActivity(), imageView1, R.drawable.profile1, 0, 0);

        ImageView imageView2 = view.findViewById(R.id.imageView2);

        Utils.setCircleImageToImageView(getActivity(), imageView2, R.drawable.profile2, 0, 0);

        ImageView imageView3 = view.findViewById(R.id.imageView3);

        Utils.setCircleImageToImageView(getActivity(), imageView3, R.drawable.pic3, 0, 0);

        ImageView imageView4 = view.findViewById(R.id.imageView4);

        Utils.setCircleImageToImageView(getActivity(), imageView4, R.drawable.pic4, 0, 0);
        ImageView imageView5 = view.findViewById(R.id.imageView5);

        Utils.setCircleImageToImageView(getActivity(), imageView5, R.drawable.pic5, 0, 0);


    }

    public boolean toggleArrow(View view) {
        if (view.getRotation() == 0) {
            view.animate().setDuration(200).rotation(180);
            return true;
        } else {
            view.animate().setDuration(200).rotation(0);
            return false;
        }
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

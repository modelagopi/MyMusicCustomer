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

import com.example.mymusic.BookACall;
import com.example.mymusic.R;
import com.example.mymusic.Ticket_Booking_Activity;
import com.example.mymusic.Utils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Calls_Upcomming_Fragment extends Fragment {

    Context context;
    LinearLayout bookLL1;

    public Calls_Upcomming_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.calls_upcomming_fragemnt, container, false);

      /*  FloatingActionButton fab = view.findViewById(R.id.callsfab);
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

        ImageView book1 = view.findViewById(R.id.book1);
        book1.setImageResource(R.drawable.booking);
        LinearLayout bookLL1 = view.findViewById(R.id.bookLL1);
        bookLL1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Ticket_Booking_Activity.class));
            }
        });

        ImageView book2 = view.findViewById(R.id.book2);
        book2.setImageResource(R.drawable.booking);
        LinearLayout bookLL2 = view.findViewById(R.id.bookLL2);
        bookLL2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Ticket_Booking_Activity.class));
            }
        });
        ImageView book3 = view.findViewById(R.id.book3);
        book3.setImageResource(R.drawable.booking);
        LinearLayout bookLL3 = view.findViewById(R.id.bookLL3);
        bookLL3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Ticket_Booking_Activity.class));
            }
        });

        ImageView book4 = view.findViewById(R.id.book4);
        book4.setImageResource(R.drawable.booking);
        LinearLayout bookLL4 = view.findViewById(R.id.bookLL4);
        bookLL4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Ticket_Booking_Activity.class));
            }
        });

        ImageView book5 = view.findViewById(R.id.book5);
        book5.setImageResource(R.drawable.booking);
        LinearLayout bookLL5 = view.findViewById(R.id.bookLL5);
        bookLL5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Ticket_Booking_Activity.class));
            }
        });
        ImageView book6 = view.findViewById(R.id.book6);
        book6.setImageResource(R.drawable.booking);
        LinearLayout bookLL6 = view.findViewById(R.id.bookLL6);
        bookLL6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Ticket_Booking_Activity.class));
            }
        });

        ImageView book7 = view.findViewById(R.id.book7);
        book7.setImageResource(R.drawable.booking);
        LinearLayout bookLL7 = view.findViewById(R.id.bookLL7);
        bookLL7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Ticket_Booking_Activity.class));
            }
        });

        ImageView book8 = view.findViewById(R.id.book8);
        book8.setImageResource(R.drawable.booking);
        LinearLayout bookLL8 = view.findViewById(R.id.bookLL8);
        bookLL8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Ticket_Booking_Activity.class));
            }
        });

        ImageView book9 = view.findViewById(R.id.book9);
        book9.setImageResource(R.drawable.booking);
        LinearLayout bookLL9 = view.findViewById(R.id.bookLL9);
        bookLL9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Ticket_Booking_Activity.class));
            }
        });

        ImageView book10 = view.findViewById(R.id.book10);
        book10.setImageResource(R.drawable.booking);
        LinearLayout bookLL10 = view.findViewById(R.id.bookLL10);
        bookLL10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), Ticket_Booking_Activity.class));
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

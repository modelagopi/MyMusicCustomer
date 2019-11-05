package com.example.mymusic.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymusic.R;
import com.example.mymusic.Utils;
import com.example.mymusic.object.DirectoryHome7Category;

import java.util.ArrayList;

public class HomeEventsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {

    private ArrayList<DirectoryHome7Category> catArrayList;
    private AdapterView.OnItemClickListener itemClickListener;
    private Context context;



    public interface OnItemClickListener {
        void onItemClick(View view, DirectoryHome7Category obj, int position);
    }

    public void setOnItemClickListener(final OnItemClickListener mItemClickListener) {
       /* this.itemClickListener = mItemClickListener;*/
    }

    public HomeEventsAdapter(ArrayList<DirectoryHome7Category> catArrayList) {
        this.catArrayList = catArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.feature_dashboard_directory_dashboard_7_item , parent, false);

        return new PlaceViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder reholder, int position) {

        if(reholder instanceof PlaceViewHolder) {
            PlaceViewHolder holder = (PlaceViewHolder) reholder;
            DirectoryHome7Category cats = catArrayList.get(position);

            holder.catNameTextView.setText(cats.name);

            context = holder.catImageView.getContext();

            int idCatImage = Utils.getDrawableInt(context, cats.image);
            Utils.setImageToImageView(context, holder.catImageView, idCatImage);

            Utils.setCircleImageToImageView(context, holder.catbackgroundImageView, R.drawable.white_background, 0,0);

            int color = Color.parseColor(cats.color);
            holder.catbackgroundImageView.setColorFilter(color, PorterDuff.Mode.SRC_IN);

            holder.catbackgroundImageView.setOnClickListener(view -> {
                if(itemClickListener != null) {
                 /*   itemClickListener.onItemClick(view, catArrayList.get(position), position);*/
                }
            });

        }

    }

    @Override
    public int getItemCount() {
        return catArrayList.size();
    }

    public class PlaceViewHolder extends RecyclerView.ViewHolder {
        public ImageView catImageView;
        public TextView catNameTextView;
        public ImageView catbackgroundImageView;

        public PlaceViewHolder(View view) {
            super(view);
            catImageView = view.findViewById(R.id.catImageView);
            catNameTextView = view.findViewById(R.id.catNameTextView);
            catbackgroundImageView = view.findViewById(R.id.catbackgroundImageView);
        }
    }
}

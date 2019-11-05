package com.example.mymusic.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mymusic.R;
import com.example.mymusic.Utils;
import com.example.mymusic.object.ChatDetailsVO;

import java.util.List;

public class FeatureChatGeneralChat2Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final int OWNER = 0;
    private final int OTHER = 1;
    private final int TIME = 2;


    private List<ChatDetailsVO> chatDetailsList;

    public FeatureChatGeneralChat2Adapter(List<ChatDetailsVO> chatDetailsList) {
        this.chatDetailsList = chatDetailsList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == OWNER) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.feature_chat_general_chat2_item_owner, parent, false);

            return new ChatDetailsOwnerViewHolder(itemView);
        } else if (viewType == OTHER) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.feature_chat_general_chat2_item_other, parent, false);

            return new ChatDetailsOtherViewHolder(itemView);
        } else {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.feature_chat_general_chat2_time, parent, false);

            return new ChatDetailTimeViewHolder(itemView);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        if (chatDetailsList.get(position).getType().equals("owner")) {
            if (holder instanceof ChatDetailsOwnerViewHolder) {

                ChatDetailsOwnerViewHolder ownerViewHolder = (ChatDetailsOwnerViewHolder) holder;
                ChatDetailsVO chatDetails = chatDetailsList.get(position);
                Context context = ownerViewHolder.profileImageView.getContext();

                int imageId = Utils.getDrawableInt(context, chatDetails.getProfileImage());
                int sentImageId = Utils.getDrawableInt(context, "baseline_done_black_24");
                int readImageId = Utils.getDrawableInt(context, "baseline_done_all_blue_24");

                Utils.setCircleImageToImageView(context, ownerViewHolder.profileImageView, imageId,0,0);
                ownerViewHolder.messageTextView.setText(chatDetails.getMessage());
                ownerViewHolder.timeTextView.setText(chatDetails.getTimestamp());

                if (chatDetails.getState().equals("sent")) {
                    Utils.setImageToImageView(context, ownerViewHolder.stateImageView, sentImageId);
                } else if (chatDetails.getState().equals("read")) {
                    Utils.setImageToImageView(context, ownerViewHolder.stateImageView, readImageId);
                }
            }

        } else if (chatDetailsList.get(position).getType().equals("other")) {
            if (holder instanceof ChatDetailsOtherViewHolder) {

                ChatDetailsOtherViewHolder otherViewHolder = (ChatDetailsOtherViewHolder) holder;
                ChatDetailsVO chatDetails = chatDetailsList.get(position);
                Context context = otherViewHolder.profileImageView.getContext();

                int imageId = Utils.getDrawableInt(context, chatDetails.getProfileImage());

                Utils.setCircleImageToImageView(context, otherViewHolder.profileImageView, imageId,0,0);
                otherViewHolder.messageTextView.setText(chatDetails.getMessage());
                otherViewHolder.timeTextView.setText(chatDetails.getTimestamp());
            }

        } else if (chatDetailsList.get(position).getType().equals("time")) {
            if (holder instanceof ChatDetailTimeViewHolder) {
                ChatDetailTimeViewHolder timeViewHolder = (ChatDetailTimeViewHolder) holder;
                timeViewHolder.timeTextView.setText(chatDetailsList.get(position).getMessage());
            }
        }
    }

    @Override
    public int getItemCount() {
        return chatDetailsList.size();
    }

    @Override
    public int getItemViewType(int position) {
        switch (chatDetailsList.get(position).getType()) {
            case "owner":
                return OWNER;
            case "other":
                return OTHER;
            default:
                return TIME;
        }
    }

    public class ChatDetailsOwnerViewHolder extends RecyclerView.ViewHolder {

        ImageView profileImageView;
        TextView messageTextView;
        TextView timeTextView;
        ImageView stateImageView;

        public ChatDetailsOwnerViewHolder(View itemView) {
            super(itemView);

            profileImageView = itemView.findViewById(R.id.profileImageView);
            messageTextView = itemView.findViewById(R.id.messageTextView);
            timeTextView = itemView.findViewById(R.id.timeTextView);
            stateImageView = itemView.findViewById(R.id.stateImageView);
        }
    }

    public class ChatDetailsOtherViewHolder extends RecyclerView.ViewHolder {

        ImageView profileImageView;
        TextView messageTextView;
        TextView timeTextView;

        public ChatDetailsOtherViewHolder(View itemView) {
            super(itemView);

            profileImageView = itemView.findViewById(R.id.profileImageView);
            messageTextView = itemView.findViewById(R.id.messageTextView);
            timeTextView = itemView.findViewById(R.id.timeTextView);
        }
    }

    public class ChatDetailTimeViewHolder extends RecyclerView.ViewHolder {

        TextView timeTextView;

        public ChatDetailTimeViewHolder(View itemView) {
            super(itemView);

            timeTextView = itemView.findViewById(R.id.dateTextView);
        }
    }
}

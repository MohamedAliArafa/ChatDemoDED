package com.example.chatdemo.ChatSplash;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.chatdemo.R;

import java.util.ArrayList;

/**
 * Created by root on 8/31/17.
 */

public class SplashChatAdapter extends RecyclerView.Adapter<SplashChatAdapter.MyViewHolder> {


    private ArrayList<ChatMessage> chatArrayList = new ArrayList<>();

    public SplashChatAdapter() {
    }

    public SplashChatAdapter(ArrayList<ChatMessage> list) {
        this.chatArrayList = list;
    }

    public void delete(int position) {
        chatArrayList.remove(position);
        notifyItemRemoved(position);
    }

    public void add(int position, String text, Integer image, boolean isMine) {
        chatArrayList.add(new ChatMessage(text, image, isMine));
        notifyItemInserted(position);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        if (viewType == 1) {
            itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item_message_you, parent, false);
        } else {
            itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.list_item_message_me, parent, false);
        }
        return new MyViewHolder(itemView);
    }

    @Override
    public int getItemViewType(int position) {
        if (chatArrayList.get(position).isMine())
            return 1;
        return 2;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.title.setText(chatArrayList.get(position).getBody());
        try {
            holder.image.setImageResource(chatArrayList.get(position).getDrawable());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public int getItemCount() {
        return chatArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView image;

        MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.textView);
            image = view.findViewById(R.id.imageView);
        }
    }
}

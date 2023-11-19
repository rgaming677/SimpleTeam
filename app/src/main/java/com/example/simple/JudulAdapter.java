package com.example.simple;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class JudulAdapter extends RecyclerView.Adapter<JudulAdapter.JudulViewHolder> {
    private final LayoutInflater mInflater;
    private List<JudulModel> judulList;
    private Context context;
    final OnItemClickListener listener;

    public JudulAdapter(List<JudulModel> judulList, Context context, OnItemClickListener listener) {
        this.mInflater = LayoutInflater.from(context);
        this.judulList = judulList;
        this.context = context;
        this.listener = listener;
    }

    @NonNull
    @Override
    public JudulAdapter.JudulViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_menu, null);
        return new JudulAdapter.JudulViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JudulAdapter.JudulViewHolder holder, int position) {
        holder.bindData(judulList.get(position));
    }

    @Override
    public int getItemCount() {
        return judulList.size();
    }

    public interface OnItemClickListener {
        void onItemClick(JudulModel item);
    }
    public void setItems(List<JudulModel> items){
        judulList = items;
    }
    public class JudulViewHolder extends RecyclerView.ViewHolder {
        TextView tvItem;
        ImageView ivMenu;

        public JudulViewHolder(@NonNull View itemView) {
            super(itemView);
            ivMenu = itemView.findViewById(R.id.ivMenu);
            tvItem = itemView.findViewById(R.id.tvItem);
        }
        public void bindData(final JudulModel item) {
            tvItem.setText(item.getJudul());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}
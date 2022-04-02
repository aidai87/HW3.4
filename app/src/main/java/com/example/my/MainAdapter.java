package com.example.my;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    private ArrayList<String> data;

    public MainAdapter(ArrayList<String> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cont, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder {

        private TextView TextView;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            TextView = itemView.findViewById(R.id.textView);
        }


        public void bind(String s) {
            TextView.setText(s);
        }
    }
}

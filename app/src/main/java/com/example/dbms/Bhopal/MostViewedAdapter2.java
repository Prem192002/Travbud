package com.example.dbms.Bhopal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dbms.R;

import java.util.ArrayList;

public class MostViewedAdapter2 extends RecyclerView.Adapter<MostViewedAdapter2.MostViewedViewHolder> {
    ArrayList<MostViewedHelper2> mostViewedLocations2;
    public MostViewedAdapter2(ArrayList<MostViewedHelper2> mostViewedLocations2) {
        this.mostViewedLocations2 = mostViewedLocations2;
    }
    @NonNull
    @Override
    public MostViewedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurants, parent, false);
        MostViewedViewHolder mostViewedViewHolder = new MostViewedViewHolder(view);
        return mostViewedViewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull MostViewedViewHolder holder, int position) {
        MostViewedHelper2 helperClass = mostViewedLocations2.get(position);
        holder.imageView.setImageResource(helperClass.getImage());
        holder.textView.setText(helperClass.getTitle());
    }
    @Override
    public int getItemCount() {
        return mostViewedLocations2.size();
    }
    public static class MostViewedViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public MostViewedViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.resimg1);
            textView = itemView.findViewById(R.id.res1);
        }
    }
}

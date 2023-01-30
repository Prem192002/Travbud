package com.example.dbms.Lucknow;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dbms.Lucknow.MostViewedHelperClass3;
import com.example.dbms.R;

import java.util.ArrayList;

public class MostViewedAdapter3 extends RecyclerView.Adapter<com.example.dbms.Lucknow.MostViewedAdapter3.MostViewedViewHolder> {
    ArrayList<MostViewedHelperClass3> MostViewedLocations3;
    public MostViewedAdapter3(ArrayList<MostViewedHelperClass3> MostViewedLocations3) {
        this.MostViewedLocations3    = MostViewedLocations3;
    }
    @NonNull
    @Override
    public com.example.dbms.Lucknow.MostViewedAdapter3.MostViewedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurants, parent, false);
        com.example.dbms.Lucknow.MostViewedAdapter3.MostViewedViewHolder mostViewedViewHolder = new com.example.dbms.Lucknow.MostViewedAdapter3.MostViewedViewHolder(view);
        return mostViewedViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MostViewedViewHolder holder, int position) {
        MostViewedHelperClass3 helperClass = MostViewedLocations3.get(position);
        holder.imageView.setImageResource(helperClass.getImage());
        holder.textView.setText(helperClass.getTitle());
    }




    @Override
    public int getItemCount() {
        return MostViewedLocations3.size();
    }
    public static class MostViewedViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public MostViewedViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.resimg1);
            textView = itemView.findViewById(R.id.res1);
        }
    }
}

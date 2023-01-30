package com.example.dbms.Kolkata;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dbms.R;

import java.util.ArrayList;

public class MostViewedAdapter4 extends RecyclerView.Adapter<com.example.dbms.Kolkata.MostViewedAdapter4.MostViewedViewHolder> {
    ArrayList<MostViewedHelperClass4> MostViewedLocations4;
    public MostViewedAdapter4(ArrayList<MostViewedHelperClass4> MostViewedLocations4) {
        this.MostViewedLocations4 = MostViewedLocations4;
    }
    @NonNull
    @Override
    public com.example.dbms.Kolkata.MostViewedAdapter4.MostViewedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurants, parent, false);
        com.example.dbms.Kolkata.MostViewedAdapter4.MostViewedViewHolder mostViewedViewHolder = new com.example.dbms.Kolkata.MostViewedAdapter4.MostViewedViewHolder(view);
        return mostViewedViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MostViewedViewHolder holder, int position) {

        MostViewedHelperClass4 helperClass = MostViewedLocations4.get(position);
        holder.imageView.setImageResource(helperClass.getImage());
        holder.textView.setText(helperClass.getTitle());

    }



    @Override
    public int getItemCount() {
        return MostViewedLocations4.size();
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

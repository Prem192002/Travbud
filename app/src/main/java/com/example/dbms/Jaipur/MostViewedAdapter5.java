package com.example.dbms.Jaipur;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dbms.Jaipur.MostViewedHelperClass5;
import com.example.dbms.R;

import java.util.ArrayList;

public class MostViewedAdapter5 extends RecyclerView.Adapter<com.example.dbms.Jaipur.MostViewedAdapter5.MostViewedViewHolder> {
    ArrayList<MostViewedHelperClass5> MostViewedLocations5;
    public MostViewedAdapter5(ArrayList<MostViewedHelperClass5> MostViewedLocations5) {
        this.MostViewedLocations5 = MostViewedLocations5;
    }
    @NonNull
    @Override
    public com.example.dbms.Jaipur.MostViewedAdapter5.MostViewedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.restaurants, parent, false);
        com.example.dbms.Jaipur.MostViewedAdapter5.MostViewedViewHolder mostViewedViewHolder = new com.example.dbms.Jaipur.MostViewedAdapter5.MostViewedViewHolder(view);
        return mostViewedViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MostViewedViewHolder holder, int position) {
        MostViewedHelperClass5 helperClass = MostViewedLocations5.get(position);
        holder.imageView.setImageResource(helperClass.getImage());
        holder.textView.setText(helperClass.getTitle());
    }


    @Override
    public int getItemCount() {
        return MostViewedLocations5.size();
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

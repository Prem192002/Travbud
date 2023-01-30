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

public class FeaturedAdapter4 extends RecyclerView.Adapter<FeaturedAdapter4.FeaturedViewHolder> {

    ArrayList<FeaturedHelperClass4> featuredLocations;

    public FeaturedAdapter4(ArrayList<FeaturedHelperClass4> featuredLocations) {
        this.featuredLocations = featuredLocations;
    }

    @NonNull
    @Override
    public FeaturedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_design,parent,false);
        FeaturedViewHolder featuredViewHolder = new FeaturedViewHolder(view);
        return featuredViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedViewHolder holder, int position) {

        FeaturedHelperClass4 featuredHelperClass = featuredLocations.get(position);

        holder.image.setImageResource(featuredHelperClass.getImage());
        holder.title.setText(featuredHelperClass.getTitle());
        holder.desc.setText(featuredHelperClass.getImage());

    }

    @Override
    public int getItemCount() {
        return featuredLocations.size();
    }


    public static class FeaturedViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView title,desc;

        public FeaturedViewHolder(@NonNull View itemView) {
            super(itemView);

            //hooks
            image = itemView.findViewById(R.id.featured_image);
            title = itemView.findViewById(R.id.featured_title);
            desc = itemView.findViewById(R.id.featured_description);



        }
    }
}

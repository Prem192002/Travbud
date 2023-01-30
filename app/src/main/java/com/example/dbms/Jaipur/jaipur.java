package com.example.dbms.Jaipur;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.dbms.Jaipur.FeaturedAdapter5;
import com.example.dbms.Jaipur.FeaturedHelperClass5;

import com.example.dbms.Imageupload;
import com.example.dbms.R;
import com.example.dbms.delhi.FeaturedAdapter;


import java.util.ArrayList;



public class jaipur extends AppCompatActivity {
    RecyclerView featuredRecycler, mostViewedRecycler5;
    RecyclerView.Adapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_jaipur);
        //Hooks
        featuredRecycler = findViewById(R.id.featured_recycler5);
        mostViewedRecycler5 = findViewById(R.id.most_viewed_recycler5);

        //Functions will be executed automatically when this activity will be created
        featuredRecycler();
        mostViewedRecycler();

        Button button;

        button = findViewById(R.id.share2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(com.example.dbms.Jaipur.jaipur.this, Imageupload.class));
            }
        });


    }

    private void mostViewedRecycler() {
        mostViewedRecycler5.setHasFixedSize(true);
        mostViewedRecycler5.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<MostViewedHelperClass5> MostViewedLocations = new ArrayList<>();
        MostViewedLocations.add(new MostViewedHelperClass5(R.drawable.dragonhouse, "Manohar Dairies and Restro","delhi"));
        MostViewedLocations.add(new MostViewedHelperClass5(R.drawable.govindamretreat, "Bay Leaf","delhi"));
        MostViewedLocations.add(new MostViewedHelperClass5(R.drawable.houseffhan, "Under The Mango Tree","delhi"));
        MostViewedLocations.add(new MostViewedHelperClass5(R.drawable.theverandha, "Shahnama","delhi"));
        MostViewedLocations.add(new MostViewedHelperClass5(R.drawable.topazrestro, "The Dream Cafe","delhi"));

        adapter = new MostViewedAdapter5(MostViewedLocations);
        mostViewedRecycler5.setAdapter(adapter);
    }
    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelperClass5> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelperClass5(R.drawable.hawa_mahal, "Hawa Mahal", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass5(R.drawable.jaigarh_fort, "Jaigarh Fort", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass5(R.drawable.jantar_mantar, "Jantar Mantar", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass5(R.drawable.city_palace, "City Palace", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass5(R.drawable.jal_mahal, "Jal Mahal", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass5(R.drawable.nahargarh, "Nahar Garh", "One of the seven wonders of the world. A nice place to visit"));

        adapter = new FeaturedAdapter5(featuredLocations);
        featuredRecycler.setAdapter(adapter);

    }
}
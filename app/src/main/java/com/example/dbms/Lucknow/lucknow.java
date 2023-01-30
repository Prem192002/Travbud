package com.example.dbms.Lucknow;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dbms.Imageupload;

import com.example.dbms.R;

import java.util.ArrayList;

public class lucknow extends AppCompatActivity {
    RecyclerView featuredRecycler, mostViewedRecycler3;
    RecyclerView.Adapter adapter;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_lucknow);
        //Hooks
        featuredRecycler = findViewById(R.id.featured_recycler3);
        mostViewedRecycler3 = findViewById(R.id.most_viewed_recycler3);

        //Functions will be executed automatically when this activity will be created
        featuredRecycler();
        mostViewedRecycler3();

        Button button;

        button = findViewById(R.id.share5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(com.example.dbms.Lucknow.lucknow.this, Imageupload.class));
            }
        });


    }

    private void mostViewedRecycler3() {

        mostViewedRecycler3.setHasFixedSize(true);
        mostViewedRecycler3.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<MostViewedHelperClass3> MostViewedLocations3 = new ArrayList<>();
        MostViewedLocations3.add(new MostViewedHelperClass3(R.drawable.marineroom, "Marine Room", "delhi"));
        MostViewedLocations3.add(new MostViewedHelperClass3(R.drawable.tundaykababi, "Tunday Kababi", "delhi"));
        MostViewedLocations3.add(new MostViewedHelperClass3(R.drawable.royalsky, "Royal Sky", "delhi"));
        MostViewedLocations3.add(new MostViewedHelperClass3(R.drawable.idrisbiryani, "Idris Biryani", "delhi"));
        MostViewedLocations3.add(new MostViewedHelperClass3(R.drawable.packnchew, "Pack N Chew", "delhi"));

        adapter = new MostViewedAdapter3(MostViewedLocations3);
        mostViewedRecycler3.setAdapter(adapter);
    }




    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelperClass3> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelperClass3(R.drawable.nwas, "NWAS Zoological Garden", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass3(R.drawable.lulu_mall, "Lulu Mall", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass3(R.drawable.regional, "Regional Science City", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass3(R.drawable.anandi, "Anandi Waterpark", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass3(R.drawable.botanic_garden, "Botanic Garden", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass3(R.drawable.dream_amusement, "Dream Amusement Park", "One of the seven wonders of the world. A nice place to visit"));
        adapter = new FeaturedAdapter3(featuredLocations);
        featuredRecycler.setAdapter(adapter);

    }
}
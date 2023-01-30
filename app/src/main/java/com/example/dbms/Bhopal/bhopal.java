package com.example.dbms.Bhopal;

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


public class bhopal extends AppCompatActivity {
    RecyclerView featuredRecycler, mostViewedRecycler2;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_bhopal);
        //Hooks
        featuredRecycler = findViewById(R.id.featured_recycler2);
        mostViewedRecycler2 = findViewById(R.id.most_viewed_recycler2);

        //Functions will be executed automatically when this activity will be created
        featuredRecycler();
        mostViewedRecycler();

        Button button;

        button = findViewById(R.id.share4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(com.example.dbms.Bhopal.bhopal.this, Imageupload.class));
            }
        });


    }

    private void mostViewedRecycler() {
        mostViewedRecycler2.setHasFixedSize(true);
        mostViewedRecycler2.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<MostViewedHelper2> mostViewedLocations = new ArrayList<>();
        mostViewedLocations.add(new MostViewedHelper2(R.drawable.manohar, "Manohar Dairies and Restro","delhi"));
        mostViewedLocations.add(new MostViewedHelper2(R.drawable.bay_leaf, "Bay Leaf","delhi"));
        mostViewedLocations.add(new MostViewedHelper2(R.drawable.underthe, "Under The Mango Tree","delhi"));
        mostViewedLocations.add(new MostViewedHelper2(R.drawable.shahnama, "Shahnama","delhi"));
        mostViewedLocations.add(new MostViewedHelper2(R.drawable.tehdream, "The Dream Cafe","delhi"));
        mostViewedLocations.add(new MostViewedHelper2(R.drawable.lakuchina, "La Kuchina","delhi"));
        adapter = new MostViewedAdapter2(mostViewedLocations);
        mostViewedRecycler2.setAdapter(adapter);
    }
    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelperClass2> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelperClass2(R.drawable.upper_lake, "Upper Lake", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass2(R.drawable.bhembetka, "Bhimbetka Rock Shelter", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass2(R.drawable.db_mall, "DB Mall", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass2(R.drawable.van_vihar, "Van Vihar", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass2(R.drawable.tribal_musium, "Tribal Museum", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass2(R.drawable.sair_sapata, "Sair Sapata", "One of the seven wonders of the world. A nice place to visit"));

        adapter = new FeaturedAdapter2(featuredLocations);
        featuredRecycler.setAdapter(adapter);

    }
}





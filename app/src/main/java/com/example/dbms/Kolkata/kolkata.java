package com.example.dbms.Kolkata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.dbms.Imageupload;
import com.example.dbms.Jaipur.FeaturedAdapter5;
import com.example.dbms.Jaipur.FeaturedHelperClass5;
import com.example.dbms.Jaipur.MostViewedAdapter5;
import com.example.dbms.Jaipur.MostViewedHelperClass5;
import com.example.dbms.R;
import com.example.dbms.delhi.Delhi;
import com.example.dbms.delhi.FeaturedAdapter;
import com.example.dbms.delhi.FeaturedHelperClass;

import java.util.ArrayList;



public class kolkata extends AppCompatActivity {
    RecyclerView featuredRecycler, mostViewedRecycler4;
    RecyclerView.Adapter adapter;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_kolkata);
        //Hooks
        featuredRecycler = findViewById(R.id.featured_recycleer4);
        mostViewedRecycler4 = findViewById(R.id.most_viewed_recycler4);

        //Functions will be executed automatically when this activity will be created
        featuredRecycler();
        mostViewedRecycler4();

        Button button;

        button = findViewById(R.id.share3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(com.example.dbms.Kolkata.kolkata.this, Imageupload.class));
            }
        });


    }

    private void mostViewedRecycler4() {

        mostViewedRecycler4.setHasFixedSize(true);
        mostViewedRecycler4.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<MostViewedHelperClass4> MostViewedLocations4 = new ArrayList<>();
        MostViewedLocations4.add(new MostViewedHelperClass4(R.drawable.socialkitchen, "Social Kitchen", "delhi"));
        MostViewedLocations4.add(new MostViewedHelperClass4(R.drawable.firstinnings, "First-Innings", "delhi"));
        MostViewedLocations4.add(new MostViewedHelperClass4(R.drawable.kava, "Kava", "delhi"));
        MostViewedLocations4.add(new MostViewedHelperClass4(R.drawable.thebridge, "The Bridge", "delhi"));
        MostViewedLocations4.add(new MostViewedHelperClass4(R.drawable.edenpavillion, "Eden Pavilion", "delhi"));

        adapter = new MostViewedAdapter4(MostViewedLocations4);
        mostViewedRecycler4.setAdapter(adapter);
    }


    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelperClass4> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelperClass4(R.drawable.victoria_memorial,"Victoria Memorial", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass4(R.drawable.eco_park,"ECO Park", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass4(R.drawable.science_city,"Science City", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass4(R.drawable.nicco_park,"Nicco Park", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass4(R.drawable.mp_birla,"M.P Birla Planetarium", "One of the seven wonders of the world. A nice place to visit"));
        featuredLocations.add(new FeaturedHelperClass4(R.drawable.indian_museum,"Indian Museum", "One of the seven wonders of the world. A nice place to visit"));
        adapter = new FeaturedAdapter4(featuredLocations);
        featuredRecycler.setAdapter(adapter);

    }
}
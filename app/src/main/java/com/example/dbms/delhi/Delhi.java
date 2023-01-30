package com.example.dbms.delhi;

 import android.annotation.SuppressLint;
 import android.content.Intent;
 import android.graphics.drawable.GradientDrawable;
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








public class Delhi extends AppCompatActivity {
    RecyclerView featuredRecycler, mostViewedRecycler, categoriesRecycler;
    RecyclerView.Adapter adapter;
    private GradientDrawable gradient1, gradient2, gradient3, gradient4;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_delhi);
        //Hooks
        featuredRecycler = findViewById(R.id.featured_recycler);
        mostViewedRecycler = findViewById(R.id.most_viewed_recycler);

        //Functions will be executed automatically when this activity will be created
        featuredRecycler();
        mostViewedRecycler();

        Button button;
        button = findViewById(R.id.share1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Delhi.this, Imageupload.class));
            }
        });


    }

    private void mostViewedRecycler() {
        mostViewedRecycler.setHasFixedSize(true);
        mostViewedRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<MostViewedHelperClass> mostViewedLocations = new ArrayList<>();
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.tamra, "Tamra","delhi"));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.dilli32, "Dilli32","delhi"));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.olive_bar_and_kitchen, "Olive Bar And Kitchen","delhi"));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.spice_route, "Spice Route","delhi"));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.acent, "Accent","delhi"));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.gt_road, "Gt Road","delhi"));
        adapter = new MostViewedAdapter(mostViewedLocations);
        mostViewedRecycler.setAdapter(adapter);
    }
    private void featuredRecycler() {
        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new FeaturedHelperClass(R.drawable.lotustemple1, "Lotus Temple", "asbkd asudhlasn saudnas jasdjasl hisajdl asjdlnas"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.redfort, "Red Fort", "asbkd asudhlasn saudnas jasdjasl hisajdl asjdlnas"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.qutubminar, "Qutub Minar", "asbkd asudhlasn saudnas jasdjasl hisajdl asjdlnas"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.lodhigaeden, "Lodhi Garden", "asbkd asudhlasn saudnas jasdjasl hisajdl asjdlnas"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.delhi1, "", "asbkd asudhlasn saudnas jasdjasl hisajdl asjdlnas"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.gurudwara, "Walmart", "asbkd asudhlasn saudnas jasdjasl hisajdl asjdlnas"));
        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecycler.setAdapter(adapter);
    }
}


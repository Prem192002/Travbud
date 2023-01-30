package com.example.dbms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.dbms.Kolkata.kolkata;

public class card extends AppCompatActivity {

    CardView cardView1,cardView2,cardView3,cardView4,cardView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);

        cardView1 = findViewById(R.id.card1);
        cardView2 = findViewById(R.id.card2);
        cardView3 = findViewById(R.id.card3);
        cardView4 = findViewById(R.id.card4);
        cardView5 = findViewById(R.id.card5);

        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(card.this, "Delhi", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(card.this,com.example.dbms.delhi.Delhi.class));
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(card.this, "Bhopal", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(card.this, com.example.dbms.Bhopal.bhopal.class));

            }
        });

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(card.this, "lucknow", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(card.this, com.example.dbms.Lucknow.lucknow.class));

            }
        });

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(card.this, "Kolkata", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(card.this,com.example.dbms.Kolkata.kolkata.class));


            }
        });

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(card.this, "Jaipur", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(card.this,com.example.dbms.Jaipur.jaipur.class));

            }
        });
    }
}
package com.example.cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView school, hospital, restaurant, airport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        school = findViewById(R.id.schoolCardView);
        hospital = findViewById(R.id.hospitalCardView);
        airport = findViewById(R.id.airportCardView);
        restaurant = findViewById(R.id.restaurantCardView);

        school.setOnClickListener(this);
        hospital.setOnClickListener(this);
        airport.setOnClickListener(this);
        restaurant.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.schoolCardView){
            Toast.makeText(MainActivity.this, "You Click on School", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId()==R.id.hospitalCardView){
            Toast.makeText(MainActivity.this, "You Click on Hospital", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId()==R.id.airportCardView){
            Toast.makeText(MainActivity.this, "You Click on Airport", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId()==R.id.restaurantCardView){
            Toast.makeText(MainActivity.this, "You Click on Restaurant", Toast.LENGTH_SHORT).show();
        }
    }
}
package com.example.gridview2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class MainActivity extends AppCompatActivity {
    GridView simpleGrid;
    int logos[] = {R.drawable.logo1, R.drawable.logo2, R.drawable.logo3, R.drawable.logo4,
            R.drawable.logo5, R.drawable.logo6, R.drawable.logo7, R.drawable.logo8, R.drawable.logo9,
            R.drawable.logo10, R.drawable.logo11, R.drawable.logo12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Iniciamos GridView
        simpleGrid = (GridView) findViewById(R.id.simpleGridView);
        // Se crea un objeto de Adaptador personalizado y se configura el Adaptador en GridView
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), logos);
        simpleGrid.setAdapter(customAdapter);
        // Se implementa el evento setOnItemClickListener en GridView
        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Se establece un intent explícito con SecondActivity.class
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                // poner datos de imagen en Intent
                intent.putExtra("image", logos[position]);
                // Comienza nuestro Intent
                startActivity(intent);
            }
        });
    }
}

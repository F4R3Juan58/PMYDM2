package com.example.gridview2;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {
    ImageView selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        // Iniciamos ImageView
        selectedImage = (ImageView) findViewById(R.id.selectedImage);
        // Se obtiene el Intent que establecimos en la actividad anterior
        Intent intent = getIntent();
        //Se obtiene la imagen de Intent y se configura en ImageView
        selectedImage.setImageResource(intent.getIntExtra("image", 0));
    }
}

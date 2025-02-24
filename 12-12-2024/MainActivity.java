package com.example.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {

    ListView simpleList;
    String listaDePaises[] = {"Francia", "China", "España", "Portugal", "Perú", "Canada"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        ArrayAdapter<String> adapterAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, listaDePaises);
        simpleList.setAdapter(adapterAdapter);
    }
}

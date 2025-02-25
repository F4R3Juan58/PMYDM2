package com.example.gridview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomerAdapter extends BaseAdapter {
    Context context;
    int logos[];
    LayoutInflater inflter;

    public CustomerAdapter(Context applicationContext, int[] logos) {
        this.context = applicationContext;
        this.logos = logos;
        inflter = (LayoutInflater.from(applicationContext));
    }
    @Override
    public int getCount() {
        return logos.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        // inflate el layout
        view = inflter.inflate(R.layout.activity_gridview, null);
// Se obtiene la referencia a ImageView
        ImageView icon = (ImageView) view.findViewById(R.id.icon);
// establecer imágenes de logotipo
        icon.setImageResource(logos[i]);
        return view;
    }
}

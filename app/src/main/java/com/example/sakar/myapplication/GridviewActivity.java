package com.example.sakar.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;

public class GridviewActivity extends Activity {

    GridView gridView;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview_activity);

        gridView = (GridView) findViewById(R.id.gridview);
        gridView.setAdapter(new ImageAdapter(this));

        i=getIntent();

    }
}

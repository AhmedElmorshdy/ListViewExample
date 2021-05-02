package com.mmabas77.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ModelAdapter modelAdapter;
    ArrayList<Model>models;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      initView();
      setModelAdapter();


    }
    private void initView(){
        listView = findViewById(R.id.listview);
    }

    private void loadData(){
        models = new ArrayList<>();
        models.add(new Model(R.drawable.ic_launcher_foreground,"Mohamed"));
        models.add(new Model(R.drawable.ic_launcher_foreground,"Mohamed"));
        models.add(new Model(R.drawable.ic_launcher_foreground,"Mohamed"));
        models.add(new Model(R.drawable.ic_launcher_foreground,"Mohamed"));
    }

    private void setModelAdapter(){
         loadData();
        ModelAdapter adapter = new ModelAdapter(MainActivity.this,models);
        listView.setAdapter(adapter);

    }

}
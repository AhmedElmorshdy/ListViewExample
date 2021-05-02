package com.mmabas77.listviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ModelAdapter extends ArrayAdapter<Model> {
    ImageView image;
    TextView name;
    Model current;
    public ModelAdapter(@NonNull Context context, @NonNull List<Model> objects) {
        super(context, 0, objects);
    }

    private void initView(View convertView){

        name = convertView.findViewById(R.id.name);
        image = convertView.findViewById(R.id.image);
    }
    private void getData(Model current,int position){
        current = getItem(position);
        name.setText(current.getName());
        image.setImageResource(current.getImage());
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.design,parent,false);
         initView(convertView);
         getData(current,position);
         return convertView;
    }

}

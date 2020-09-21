package com.example.drawerlayoutandlistviewjava;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DrawerItemCustomAdapter extends ArrayAdapter {

    Context mContext;
    int layoutResourceId;
    DataModel[] data = null;

    public DrawerItemCustomAdapter(Context mContext, int layoutResourceId, DataModel[] data) {

        super(mContext, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.mContext = mContext;
        this.data = data;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {

       // LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        view = inflater.inflate(R.layout.list_view_item_row,
                parent,
                false);

        ImageView imageViewIcon = view.findViewById(R.id.imageViewIcon);
        TextView textViewName = view.findViewById(R.id.textViewName);

        DataModel folder = data[position];


        imageViewIcon.setImageResource(folder.icon);
        textViewName.setText(folder.name);

        return view;
    }
}

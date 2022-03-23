package com.example.itemsviewprice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

class ItemsAdapter extends ArrayAdapter<Items> {
    public ItemsAdapter(@NonNull Context context, int resource, @NonNull List<Items> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {

        view = LayoutInflater.from(getContext()).inflate(R.layout.listview, parent, false);

        Items currentItems = getItem(position);

        TextView name = view.findViewById(R.id.textView);
        name.setText( currentItems.getItemName());

        TextView price = view.findViewById(R.id.textView3);
        price.setText(currentItems.getItemPrice()+"");

        ImageView image = view.findViewById(R.id.imageView2);
        image.setImageResource(currentItems.getItemImage());
        return view;
    }
}
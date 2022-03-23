package com.example.itemsviewprice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


ArrayList<Items> items = new ArrayList<>();


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



Items i1 = new Items("cheese", R.drawable.img , 2.5);
Items i2 = new Items("honey", R.drawable.img2 , 1.5);

items.add(i1);
items.add(i2);

    ItemsAdapter itemsAdapter = new ItemsAdapter(this,0,items);
    ListView listView = findViewById(R.id.listview1);
    listView.setAdapter(itemsAdapter);
    }
}
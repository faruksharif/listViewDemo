package com.example.faruksharif.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView=findViewById(R.id.myListView);

        ArrayList<String> myFamily= new ArrayList<String>();

        myFamily.add("Sohel");
        myFamily.add("Rubel");
        myFamily.add("Tina");
        myFamily.add("Fahima");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String >(this,android.R.layout.simple_list_item_1, myFamily);

        myListView.setAdapter(arrayAdapter);

        
    }
}

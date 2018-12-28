package com.example.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListView = findViewById(R.id.peopleListView);


        final ArrayList<String> madcamp = new ArrayList<String>(asList("Mark","Jane","Sussy","Jane"));

        madcamp.add("Seungwon");
        madcamp.add("Jisu");
        madcamp.add("Taesu");
        madcamp.add("Sinjung");
        madcamp.add("Jungwoo");
        madcamp.add("Haeyeong");
        madcamp.add("Seoyeon");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, madcamp);

        myListView.setAdapter(arrayAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Hello " + madcamp.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}

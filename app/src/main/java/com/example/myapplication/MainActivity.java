package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.CpuUsageInfo;
import android.view.View;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Vector<World_Time> data = new Vector<>();
        for(int i =0 ; i < 100; i++){
            data.add(new World_Time("Africa", "12:0"+i+" AM"));
        }

        RecyclerView r = findViewById(R.id.recylerView);
        r.setLayoutManager( new LinearLayoutManager(this));
        r.setAdapter(new CustomAdaptor(data));

    }

    public void onClick(View view) {
        Intent i = new Intent(this, new_screen.class);
        i.putExtra("message","FUCK OFF");
        startActivity(i);
    }
}
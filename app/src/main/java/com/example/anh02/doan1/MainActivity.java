package com.example.anh02.doan1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<FoodList> arrayfood;
    FoodAdapter adapter;
    Button btnChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        adapter = new FoodAdapter(this, R.layout.activity_food, arrayfood);
        lv =(ListView) findViewById(R.id.lvFood);
        lv.setAdapter(adapter);
        btnChange = (Button) findViewById(R.id.Btn2);
        btnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(MainActivity.this, Manhinh4.class);
                startActivity(abc);
            }
        });

        };

    private void Anhxa() {
        arrayfood = new ArrayList<>();
        arrayfood.add(new FoodList("Bún bò",R.drawable.bunbo));
        arrayfood.add(new FoodList("Chuối",R.drawable.chuoi));
        arrayfood.add(new FoodList("Táo",R.drawable.tao));
    }
}

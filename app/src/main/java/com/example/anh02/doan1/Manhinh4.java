package com.example.anh02.doan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Manhinh4 extends AppCompatActivity {
    Button AFood;
    ImageView imageScreen4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinh4);
        imageScreen4 = (ImageView) findViewById(R.id.imageViewHinh);
        imageScreen4.setImageResource(R.drawable.bunbo);
        AFood = (Button) findViewById(R.id.AddFood);
        AFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotomain = new Intent(Manhinh4.this, MainActivity.class);
                startActivity(gotomain);
            }
        });
    }
}

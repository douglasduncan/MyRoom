package com.example.douglasduncan.myroom;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button inserT = (Button)findViewById(R.id.insertButton);
        Button vieW = (Button)findViewById(R.id.viewButton);

        inserT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "clicked insert", Toast.LENGTH_SHORT).show();
                String cartype = "M2";
            }
        });


        vieW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "clicked view", Toast.LENGTH_SHORT).show();
            }
        });

    }
}

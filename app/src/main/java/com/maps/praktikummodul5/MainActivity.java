package com.maps.praktikummodul5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button loginBtn;
    private Button loginBtn1;
    private Button loginBtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loginBtn = findViewById(R.id.loginBtn);
        loginBtn1 = findViewById(R.id.loginBtn1);
        loginBtn2 = findViewById(R.id.loginBtn2);

        loginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent i = new Intent(MainActivity.this, MapsSekolah.class);
                startActivity(i);
            }
        });

        loginBtn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent i = new Intent(MainActivity.this, MapsTempatMakan.class);
                startActivity(i);
            }
        });

        loginBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v) {
                Intent i = new Intent(MainActivity.this, MapsKantorDesa.class);
                startActivity(i);
            }
        });
    }

}
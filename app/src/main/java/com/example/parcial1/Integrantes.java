package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Integrantes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integrantes);

        Button bSalir2 = (Button) findViewById(R.id.btnSalir2);
        Button bMenu = (Button) findViewById(R.id.btnMenu);
        Button bPantallaP2=(Button)findViewById(R.id.btnPantallaP2);

        bSalir2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(0);
            }
        });

        bMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 finish();
            }
        });
        bPantallaP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siga= new Intent(Integrantes.this,MainActivity.class);

                startActivity(siga);
            }
        });
    }
    }

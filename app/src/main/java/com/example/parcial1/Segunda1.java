package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Segunda1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda1);

        TextView Nombre = (TextView) findViewById(R.id.tvNombreReci);
        TextView Apellido = (TextView) findViewById(R.id.tvApellidoReci);

        Button bRegresar = (Button) findViewById(R.id.btnPantallaP);
        Button bSalir1 = (Button) findViewById(R.id.btnSalir1);

        Button bcalculadora = (Button) findViewById(R.id.btnCalculadora);
        Button bReproM=(Button)findViewById(R.id.btnReproductorM);
        Button bReprov=(Button)findViewById(R.id.btnReproductorV);
        Button bsensor=(Button)findViewById(R.id.btnSensor);
        Button bacercaDe =(Button)findViewById(R.id.btnacercade);

        Bundle datosRecibidos = this.getIntent().getExtras();
        String nombre = datosRecibidos.getString("pNombre");
        String apellido = datosRecibidos.getString("pApellido");

        Nombre.setText("Nombre: " + nombre);
        Apellido.setText("Apellido: " + apellido);

        bcalculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent siguiente = new Intent(Segunda1.this,Calculadora.class);
                startActivity(siguiente);
            }
        });

        bReproM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent repro= new Intent(Segunda1.this,ReproductorMusica.class);
                startActivity(repro);

            }
        });

        bReprov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reprov= new Intent(Segunda1.this,ReproductorVideo.class);
                startActivity(reprov);
            }
        });

        bsensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sensor= new Intent(Segunda1.this,SensorProximidad.class);
                startActivity(sensor);
            }
        });
        bacercaDe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inte= new Intent(Segunda1.this,Integrantes.class);
                startActivity(inte);
            }
        });

        bRegresar.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View view){
                Intent Regrese = new Intent(Segunda1.this, MainActivity.class);
                startActivity(Regrese);

            }
        });

        bSalir1.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                finishAffinity();
                System.exit(0);
            }


        });

    }
}
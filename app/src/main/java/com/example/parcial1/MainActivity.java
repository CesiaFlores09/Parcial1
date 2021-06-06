package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText eNombre= (EditText)findViewById(R.id.tvNombre);
        final EditText eApellido= (EditText)findViewById(R.id.tvApellido);
        Button bIngresar= (Button)findViewById(R.id.btnIngresar);
        Button bSalir=(Button)findViewById(R.id.btnSalir);

        bIngresar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String nombre = eNombre.getText().toString();
                String apellido = eApellido.getText().toString();
                Bundle pasarDatos= new Bundle();
                pasarDatos.putString("pNombre",nombre);
                pasarDatos.putString("pApellido",apellido);
                Intent siga= new Intent(MainActivity.this,Segunda1.class);
                siga.putExtras(pasarDatos);
                startActivity(siga);
            }
        });
        bSalir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                
            }
        });

    }
}
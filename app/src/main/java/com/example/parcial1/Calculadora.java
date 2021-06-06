package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {
    EditText n1, n2;
    Button mult, div, suma, resta;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        n1 = (EditText) findViewById(R.id.nu);
        n2 = (EditText) findViewById(R.id.nu2);
        suma = (Button) findViewById(R.id.sumar);
        resta = (Button) findViewById(R.id.restar);
        mult = (Button) findViewById(R.id.multiplicacion);
        div = (Button) findViewById(R.id.division);
        resultado = findViewById(R.id.resul);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);


        Button bmenu2 = (Button) findViewById(R.id.btnMenu2);
        Button bpanP = (Button) findViewById(R.id.btnPantallaP1);
        Button bsalir3 = (Button) findViewById(R.id.btnSalir3);

        bmenu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();
            }
        });
        bpanP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siga = new Intent(Calculadora.this, MainActivity.class);

                startActivity(siga);
            }
        });
        bsalir3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(0);
            }
        });
    }

    @Override
    public void onClick(View view) {
        String num1 = n1.getText().toString();
        String num2 = n2.getText().toString();
        int entero1 = Integer.parseInt(num1);
        int entero2 = Integer.parseInt(num2);

        int rta = 0;
        switch (view.getId()) {
            case R.id.sumar:
                rta=entero1+entero2;
                break;
            case R.id.restar:
                rta=entero1-entero2;
                break;
            case R.id.multiplicacion:
                rta=entero1*entero2;
                break;
            case R.id.division:
                rta=entero1/entero2;
                break;
        }
        resultado.setText(""+rta);
    }

}




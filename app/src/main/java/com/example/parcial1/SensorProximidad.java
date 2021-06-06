package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SensorProximidad extends AppCompatActivity {
    SensorManager sensorManager;
    Sensor sensor;

    SensorEventListener sensorEventListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_proximidad);
        
        Button bMenu6=(Button)findViewById(R.id.btnMenu6);
        Button bpantalla5=(Button)findViewById(R.id.btnPantallaP5);
        Button bSalir6=(Button)findViewById(R.id.btnSalir6);

        bMenu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        bpantalla5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siga= new Intent(SensorProximidad.this,MainActivity.class);

                startActivity(siga);
            }
        });
        bSalir6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(0);
            }
        });

        final TextView texto = (TextView)findViewById(R.id.tvSensor);
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY);
        if(sensor==null)finish();
        sensorEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                if(sensorEvent.values[0] < sensor.getMaximumRange()){
                    getWindow().getDecorView().setBackgroundColor(Color.CYAN);
                    texto.setText("CAMBIADO A COLOR CELESTE");
                }else{
                    getWindow().getDecorView().setBackgroundColor(Color.LTGRAY);
                    texto.setText("SENSOR DE PROXIMIDAD");
                }

            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };
        start();

    }

    public void start() {
        sensorManager.registerListener(sensorEventListener,sensor,200*1000);
    }
    public void stop(){
        sensorManager.unregisterListener(sensorEventListener);
    }

    @Override

    protected void onPause() {
        super.onPause();
        stop();
        super.onPause();

    }
    @Override
    protected void onResume() {
        start();
        super.onResume();

    }


}

package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class ReproductorVideo extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor_video);

        videoView=(VideoView)findViewById(R.id.videoView);
        String path = "android.resource://"+ getPackageName() + "/" + R.raw.compartir;

        videoView.setVideoURI(Uri.parse(path));
        videoView.start();

        Button bMenu5=(Button)findViewById(R.id.btnMenu5);
        Button bPantalla4=(Button)findViewById(R.id.btnPantallaP4);
        Button bSalir5=(Button)findViewById(R.id.btnSalir5);

        bMenu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        bPantalla4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent siga= new Intent(ReproductorVideo.this,MainActivity.class);

                startActivity(siga);
            }
        });
        bSalir5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
                System.exit(0);

            }
        });


    }
}
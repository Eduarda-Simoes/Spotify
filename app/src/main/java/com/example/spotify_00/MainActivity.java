package com.example.spotify_00;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    ImageView coverImg;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        coverImg = findViewById(R.id.ivCover);
        Glide.with(this).load("https://img.youtube.com/vi/qN4ooNx77u0/0.jpg").into(coverImg);

        player=MediaPlayer.create(getApplicationContext(),R.raw.signofthetimes);
    }

    protected void onResume(){
        super.onResume();
    }

    public void play(View view) {
        player.start();

    }

}

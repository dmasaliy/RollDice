package com.game.rolldice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView image_00, image_01,image_11, image_21, image_22;
    Button play, cross;
    Integer [] images ={
           R.drawable.dice1,
           R.drawable.dice2,
           R.drawable.dice3,
           R.drawable.dice4,
           R.drawable.dice5,
           R.drawable.dice6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        play = findViewById(R.id.play);
        cross = findViewById(R.id.cross);

        image_00 = findViewById(R.id.image_00);
        image_01 = findViewById(R.id.image_01);
        image_11 = findViewById(R.id.image_10);
        image_21 = findViewById(R.id.image_21);
        image_22 = findViewById(R.id.image_22);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                roll();
            }
        });
        cross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    public void roll(){
        int imageId0 = (int)(Math.random() * images.length);
        int imageId1 = (int)(Math.random() * images.length);
        int imageId2 = (int)(Math.random() * images.length);
        int imageId3 = (int)(Math.random() * images.length);
        int imageId4 = (int)(Math.random() * images.length);

        image_00.setBackgroundResource(images[imageId0]);
        image_01.setBackgroundResource(images[imageId1]);
        image_11.setBackgroundResource(images[imageId2]);
        image_21.setBackgroundResource(images[imageId3]);
        image_22.setBackgroundResource(images[imageId4]);
    }

}
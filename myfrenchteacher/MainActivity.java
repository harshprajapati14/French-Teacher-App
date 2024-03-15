package com.example.myfrenchteacher;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button but1,but2,but3,but4,but5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        but1=findViewById(R.id.button1);
        but2=findViewById(R.id.button2);
        but3=findViewById(R.id.button3);
        but4=findViewById(R.id.button4);
        but5=findViewById(R.id.button5);

        but1.setOnClickListener(this);
        but2.setOnClickListener(this);
        but3.setOnClickListener(this);
        but4.setOnClickListener(this);
        but5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        if(id==R.id.button1)
        {
            playSound(R.raw.black);
        }
        if(id==R.id.button2)
        {
            playSound(R.raw.green);
        }
        if(id==R.id.button3)
        {
            playSound(R.raw.purple);
        }
        if(id==R.id.button4)
        {
            playSound(R.raw.red);
        }
        if(id==R.id.button5)
        {
            playSound(R.raw.yellow);
        }
    }

    public void playSound(int id)
    {
        MediaPlayer player=MediaPlayer.create(this,id);
        player.start();
    }
}
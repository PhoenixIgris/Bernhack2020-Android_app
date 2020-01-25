package com.igris.agrigo;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    MediaPlayer song;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        song= MediaPlayer.create(Splash.this,R.raw.so);
        song.start();
        Thread timer= new Thread(){
            @Override
            public void run() {
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent openHomePage = new Intent("com.igris.agrigo.MAINACTIVITY");
                    startActivity(openHomePage);
                }
            }
        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        song.release();
        finish();

    }
}

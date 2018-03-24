package com.example.ccojo.udacitymusicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class PlayActivity extends AppCompatActivity {
    boolean playOrPause = true;
    boolean isShuffle = true;
    boolean isRepeat = true;
    ImageButton playPauseButton;
    ImageButton shuffleButton;
    ImageButton repeatButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        playPauseButton = findViewById(R.id.play_pause_button);
        shuffleButton = findViewById(R.id.shuffle_button);
        repeatButton = findViewById(R.id.repeat_button);
        playPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(playOrPause){
                    playPauseButton.setBackground(getDrawable(R.drawable.pause_button));
                    playOrPause = false;
                } else {
                    playPauseButton.setBackground(getDrawable(R.drawable.play_button));
                    playOrPause = true;
                }
            }
        });

        shuffleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isShuffle){
                    shuffleButton.setBackground(getDrawable(R.drawable.shuffle_button_toggle));
                    isShuffle = false;
                } else {
                    shuffleButton.setBackground(getDrawable(R.drawable.shuffle_button));
                    isShuffle = true;
                }
            }
        });

        repeatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isRepeat){
                    repeatButton.setBackground(getDrawable(R.drawable.repeat_button_toggle));
                    isRepeat = false;
                } else {
                    repeatButton.setBackground(getDrawable(R.drawable.repeat_button));
                    isRepeat = true;
                }
            }
        });
    }
}

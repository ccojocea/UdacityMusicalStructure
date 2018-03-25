package com.example.ccojo.udacitymusicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class PlayActivity extends AppCompatActivity {
    boolean playOrPause = true;
    boolean isShuffle = true;
    boolean isRepeat = true;
    ImageButton playPauseButton;
    ImageButton shuffleButton;
    ImageButton repeatButton;
    ImageButton previousButton;
    ImageButton nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        playPauseButton = findViewById(R.id.play_pause_button);
        shuffleButton = findViewById(R.id.shuffle_button);
        repeatButton = findViewById(R.id.repeat_button);
        previousButton = findViewById(R.id.previous_button);
        nextButton = findViewById(R.id.next_button);
        playPauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(playOrPause){
                    playPauseButton.setBackground(getDrawable(R.drawable.pause_button));
                    playOrPause = false;
                    Toast.makeText(PlayActivity.this, "Playing", Toast.LENGTH_SHORT).show();
                } else {
                    playPauseButton.setBackground(getDrawable(R.drawable.play_button));
                    playOrPause = true;
                    Toast.makeText(PlayActivity.this, "Paused", Toast.LENGTH_SHORT).show();
                }
            }
        });

        shuffleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isShuffle){
                    shuffleButton.setBackground(getDrawable(R.drawable.shuffle_button_toggle));
                    isShuffle = false;
                    Toast.makeText(PlayActivity.this, "Shuffle on", Toast.LENGTH_SHORT).show();
                } else {
                    shuffleButton.setBackground(getDrawable(R.drawable.shuffle_button));
                    isShuffle = true;
                    Toast.makeText(PlayActivity.this, "Shuffle off", Toast.LENGTH_SHORT).show();
                }
            }
        });

        repeatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isRepeat){
                    repeatButton.setBackground(getDrawable(R.drawable.repeat_button_toggle));
                    isRepeat = false;
                    Toast.makeText(PlayActivity.this, "Repeat on", Toast.LENGTH_SHORT).show();
                } else {
                    repeatButton.setBackground(getDrawable(R.drawable.repeat_button));
                    isRepeat = true;
                    Toast.makeText(PlayActivity.this, "Repeat off", Toast.LENGTH_SHORT).show();
                }
            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayActivity.this, "Previous song - not implemented", Toast.LENGTH_SHORT).show();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(PlayActivity.this, "Next song - not implemented", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

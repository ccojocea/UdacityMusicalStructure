package com.example.ccojo.udacitymusicalstructureapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
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
    ImageView songArtImageView;
    TextView songName;
    TextView songArtist;
    TextView songAlbum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        playPauseButton = findViewById(R.id.play_pause_button);
        shuffleButton = findViewById(R.id.shuffle_button);
        repeatButton = findViewById(R.id.repeat_button);
        previousButton = findViewById(R.id.previous_button);
        nextButton = findViewById(R.id.next_button);
        songArtImageView = findViewById(R.id.song_image);
        songName = findViewById(R.id.song_name);
        songAlbum = findViewById(R.id.song_album);
        songArtist = findViewById(R.id.song_artist);

        //Check extra bundle
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String name = extras.getString("SONG_NAME");
            String artist = extras.getString("SONG_ARTIST");
            String album = extras.getString("SONG_ALBUM");
            int artId = extras.getInt("SONG_ARTID");

            songName.setText(name);
            songArtist.setText(artist);
            songAlbum.setText(album);
            songArtImageView.setImageResource(artId);
        } else {
            for (Song song : MainActivity.allSongs){
                String name = song.getSongName();
                String artist = song.getArtistName();
                String album = song.getAlbumName();
                int artId = song.getSongImageId();

                songName.setText(name);
                songArtist.setText(artist);
                songAlbum.setText(album);
                songArtImageView.setImageResource(artId);

                //get only the first song:
                break;
            }
        }

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

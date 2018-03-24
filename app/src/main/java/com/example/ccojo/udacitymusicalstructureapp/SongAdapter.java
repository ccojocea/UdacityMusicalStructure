package com.example.ccojo.udacitymusicalstructureapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ccojo on 3/24/2018.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(@NonNull Context context, @NonNull ArrayList<Song> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Song currentSong = getItem(position);

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_item, parent, false);
        }

        TextView songNameTV = listItemView.findViewById(R.id.songNameTextView);
        TextView songArtistTV = listItemView.findViewById(R.id.songArtistTextView);
        TextView songAlbumTV = listItemView.findViewById(R.id.songAlbumTextView);
        TextView songLength = listItemView.findViewById(R.id.songLengthTextView);

        songNameTV.setText(currentSong.getSongName());
        songArtistTV.setText(currentSong.getArtistName());
        songAlbumTV.setText(currentSong.getAlbumName());

        int seconds = currentSong.getSongLength();

        if(seconds >= 3600){
            String asTextHours = String.format("%02d:%02d:%02d", seconds/3600, (seconds % 3600)/60, (seconds % 3600)%60);
            songLength.setText(asTextHours);
        }else if(seconds >= 60){
            String asTextMinutes = String.format("%02d:%02d", seconds/60, seconds % 60);
            songLength.setText(asTextMinutes);
        } else {
            final String asTextSeconds = String.format("%d", seconds);
            songLength.setText("00:" + asTextSeconds);
        }

        return listItemView;
    }
}

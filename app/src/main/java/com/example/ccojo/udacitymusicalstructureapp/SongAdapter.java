package com.example.ccojo.udacitymusicalstructureapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
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
    public View getView(int position, @Nullable View convertView, @NonNull final ViewGroup parent) {
        Song currentSong = getItem(position);

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song_item, parent, false);
        }

        TextView songNameTV = listItemView.findViewById(R.id.songNameTextView);
        TextView songArtistTV = listItemView.findViewById(R.id.songArtistTextView);
        TextView songAlbumTV = listItemView.findViewById(R.id.songAlbumTextView);
        TextView songLength = listItemView.findViewById(R.id.songLengthTextView);
        ImageButton playSongButton = listItemView.findViewById(R.id.play_item_button);

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

        // Cache row position inside the button using `setTag`
        playSongButton.setTag(position);
        playSongButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = (Integer) view.getTag();
                Song song = getItem(position);

                String songName = song.getSongName();
                String songArtist = song.getArtistName();
                String songAlbum = song.getAlbumName();
                int songArtId = song.getSongImageId();

                Intent intent = new Intent(parent.getContext(), PlayActivity.class);

                intent.putExtra("SONG_NAME", songName);
                intent.putExtra("SONG_ALBUM", songArtist);
                intent.putExtra("SONG_ARTIST", songAlbum);
                intent.putExtra("SONG_ARTID", songArtId);

                parent.getContext().startActivity(intent);
            }
        });

        return listItemView;
    }
}

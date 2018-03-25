package com.example.ccojo.udacitymusicalstructureapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.List;

/**
 * Created by ccojo on 3/25/2018.
 */

public class PlaylistAdapter extends ArrayAdapter<Playlist> {
    public PlaylistAdapter(@NonNull Context context, @NonNull List<Playlist> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull final ViewGroup parent) {
        Playlist currentPlaylist = getItem(position);

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.playlist_item, parent, false);
        }

        TextView playlistNameTV = listItemView.findViewById(R.id.playlist_name);
        playlistNameTV.setText(currentPlaylist.getPlaylistName());

        ImageButton playButton = listItemView.findViewById(R.id.play_item_button);
        playButton.setTag(position);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = (Integer) view.getTag();
                Playlist playlist = getItem(position);

                int fromPlaylistsID = 3;

                Intent intent = new Intent(parent.getContext(), SongsActivity.class);
                intent.putExtra("REFERENCE", fromPlaylistsID);
                intent.putExtra("PLAYLIST", playlist);
                parent.getContext().startActivity(intent);
            }
        });

        return listItemView;
    }

}

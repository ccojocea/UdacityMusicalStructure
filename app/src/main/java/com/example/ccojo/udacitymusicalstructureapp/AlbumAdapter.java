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

import java.util.List;

/**
 * Created by ccojo on 3/25/2018.
 */

public class AlbumAdapter extends ArrayAdapter<Album> {

    public AlbumAdapter(@NonNull Context context, @NonNull List<Album> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Album currentAlbum = getItem(position);

        View gridItemView = convertView;
        if(gridItemView == null){
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_item, parent, false);
        }

        ImageView albumImg = gridItemView.findViewById(R.id.album_image);
        TextView albumNameTV = gridItemView.findViewById(R.id.album_name_tv);
        TextView artistNameTV = gridItemView.findViewById(R.id.artist_name_tv);

        albumImg.setImageResource(currentAlbum.getAlbumArt());
        albumNameTV.setText(currentAlbum.getAlbumName());
        artistNameTV.setText(currentAlbum.getArtistName());

        return gridItemView;
    }
}

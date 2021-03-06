package com.example.ccojo.udacitymusicalstructureapp;

import android.content.Context;
import android.content.Intent;
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

public class ArtistAdapter extends ArrayAdapter<Artist> {

    public ArtistAdapter(@NonNull Context context, @NonNull ArrayList<Artist> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull final ViewGroup parent) {
        Artist currentArtist = getItem(position);

        View gridItemView = convertView;
        if(gridItemView == null){
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.artist_item, parent, false);
        }

        ImageView artistImg = gridItemView.findViewById(R.id.artist_image);
        TextView artistName = gridItemView.findViewById(R.id.artist_name_tv);

        artistName.setText(currentArtist.getArtistName());
        artistImg.setImageResource(currentArtist.getArtistArt());

        artistImg.setTag(position);
        artistImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = (Integer) view.getTag();
                Artist artist = getItem(position);

                String artistName = artist.getArtistName();
                int fromArtistsID = 2;

                Intent intent = new Intent(parent.getContext(), SongsActivity.class);
                intent.putExtra("ARTIST_NAME", artistName);
                intent.putExtra("REFERENCE", fromArtistsID);
                parent.getContext().startActivity(intent);
            }
        });

        return gridItemView;
    }
}

package com.example.ccojo.udacitymusicalstructureapp;

import android.util.Log;

/**
 * Created by ccojo on 3/24/2018.
 */

public class Artist {
    private String artistName;
    private int artistArt;

    public Artist(String artistName, int artistArtId){
        this.artistName = artistName;
        this.artistArt = artistArtId;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getArtistArt() {
        return artistArt;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Artist){
            return this.artistName.equals(((Artist)obj).artistName);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 35;
        hash = 53 * hash + (this.artistName != null ? this.artistName.hashCode() : 0);
        return hash;
    }
}

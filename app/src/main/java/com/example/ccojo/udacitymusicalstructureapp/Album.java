package com.example.ccojo.udacitymusicalstructureapp;

/**
 * Created by ccojo on 3/25/2018.
 */

public class Album {
    private String artistName;
    private String albumName;
    private int albumArt;

    public Album(String albumName, String artistName, int albumArtId){
        this.artistName = artistName;
        this.albumName = albumName;
        this.albumArt = albumArtId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public int getAlbumArt() {
        return albumArt;
    }

    @Override
    public boolean equals(Object obj) {
        boolean albumNameIsEqual = false;
        boolean artistNameIsEqual = false;
        if(obj instanceof Album){
            if(this.albumName.equals(((Album)obj).albumName)){
                albumNameIsEqual = true;
            }
            if(this.artistName.equals(((Album)obj).artistName)){
                artistNameIsEqual = true;
            }
        }
        return albumNameIsEqual && artistNameIsEqual;
    }

    @Override
    public int hashCode() {
        int hash = 25;
        hash = 33 * hash + (this.artistName != null ? this.artistName.hashCode() : 0);
        hash = 25 * hash + (this.albumName != null ? this.albumName.hashCode() : 0);
        return hash;
    }
}

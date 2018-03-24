package com.example.ccojo.udacitymusicalstructureapp;

import android.media.Image;

/**
 * Created by ccojo on 3/24/2018.
 */

public class Song {
    private String songName;
    private String artistName;
    private String albumName;
    private int songImageId;
    private int songLength;

    public Song (String nm){
       this(nm, "Unknown artist", "Unknown album", 0, 0);
    }

    public Song (String nm, String art){
        this(nm, art, "Unknown album", 0, 0);
    }

    public Song (String nm, String art, String alb){
        this(nm, art, alb, 0, 0);
    }

    public Song (String nm, String art, int imgId){
        this(nm, art, "Unknown album", imgId, 0);
    }

    public Song (String nm, String art, String alb, int songlen){
        this(nm, art, alb, 0, songlen);
    }

    public Song (String nm, String art, int imgId, int songlen){
        this(nm, art, "Unknown album", imgId, songlen);
    }

    public Song (String nm, int imgId, int songlen){
        this(nm, "Unknown artist", "Unknown album", imgId, songlen);
    }

    public Song (String nm, String art, String alb, int imgId, int songlen){
        songName = nm;
        artistName = art;
        albumName = alb;
        if(imgId == 0){
            songImageId = R.drawable.musical_note512w1;
        } else {
            songImageId = imgId;
        }
        if(songlen == 0){
            //default value for now, until this can be taken out of file
            songLength = 300;
        } else {
            songLength = songlen;
        }
    }

    public int getSongImageId() {
        return songImageId;
    }

    public int getSongLength() {
        return songLength;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getSongName() {
        return songName;
    }
}

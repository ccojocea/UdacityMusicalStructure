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
       this(nm, "Unknown artist", "Unknown album", 0);
    }

    public Song (String nm, String art){
        this(nm, art, "Unknown album", 0);
    }

    public Song (String nm, String art, String alb){
        this(nm, art, alb, 0);
    }

    public Song (String nm, String art, String alb, int imgId){
        songName = nm;
        artistName = art;
        albumName = alb;
        songImageId = imgId;
    }
}

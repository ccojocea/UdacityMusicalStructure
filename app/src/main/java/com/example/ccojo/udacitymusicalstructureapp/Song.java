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
    private int songArtistArtId;
    private int songAlbumArtId;
    private int songLength;

    public Song (String nm){
        this(nm, 0, "Unknown artist", 0, "Unknown album", 0, 0);
    }

    public Song (String nm, String art){
        this(nm, 0, art, 0, "Unknown album", 0, 0);
    }

    public Song (String nm, int songArtId, String art, int artistArtId){
        this(nm, songArtId, art, artistArtId, "Unknown album", 0, 0);
    }

    public Song (String nm, String art, String alb){
        this(nm, 0, art, 0, alb, 0, 0);
    }

    public Song (String nm, String art, String alb, int songlen){
        this(nm, 0, art, 0, alb, 0, songlen);
    }

    public Song (String nm, int songArtId, String art, int artistArtId, String alb, int albumArtId){
        this(nm, songArtId, art, artistArtId, alb, albumArtId, 0);
    }

    public Song (String nm, int songArtId, String art, int artistArtId, String alb, int albumArtId, int songlen){
        songName = nm;
        artistName = art;
        albumName = alb;
        if(artistArtId == 0){
            songArtistArtId = R.drawable.smile;
        } else {
            songArtistArtId = artistArtId;
        }
        if(albumArtId == 0){
            songAlbumArtId = R.drawable.music_album;
        } else {
            songAlbumArtId = albumArtId;
        }
        if(songArtId == 0){
            songImageId = R.drawable.musical_note512w2;
        } else {
            songImageId = songArtId;
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

    public int getArtistArt(){
        return songArtistArtId;
    }

    public int getSongAlbumArtId() {
        return songAlbumArtId;
    }
}

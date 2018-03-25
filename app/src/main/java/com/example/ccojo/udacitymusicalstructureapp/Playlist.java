package com.example.ccojo.udacitymusicalstructureapp;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by ccojo on 3/25/2018.
 */

public class Playlist implements Serializable{
    private ArrayList<Song> mSongsList;
    private String playlistName;

    public Playlist(String playlistName){
        mSongsList = new ArrayList<>();
        this.playlistName = playlistName;
    }

    public void addSong(Song song){
        mSongsList.add(song);
    }

    public void removeSong(Song song){
        mSongsList.remove(song);
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public ArrayList<Song> getmSongsList() {
        return mSongsList;
    }

}

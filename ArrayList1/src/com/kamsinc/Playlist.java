package com.kamsinc;

import java.util.ArrayList;

public class Playlist {
    final private ArrayList<String> myPlaylist = new ArrayList<>();

    public void addSong(String song){
        myPlaylist.add(song);
    }
    public boolean deleteSong(String song){
        int indexToDelete = myPlaylist.indexOf(song);
        if(indexToDelete == -1){
            return false;
        }else{
            myPlaylist.remove(indexToDelete);
            return true;
        }
    }

    public String findSong(String song){
        boolean songExists = myPlaylist.contains(song);
        if (songExists){
            return "Song present in the playlist!";
        }
        return "Song not present!";
    }
    public ArrayList<String> getMyPlaylist() {
        return myPlaylist;
    }
}

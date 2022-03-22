package com.kamsinc;

import java.util.ArrayList;

public class Playlist {
    private ArrayList<String> myPlaylist = new ArrayList<String>();

    public void addSong(String song){
        myPlaylist.add(song);
    }
    public void deleteSong(int index){
        System.out.println("Removing song - "+myPlaylist.get(index));
        myPlaylist.remove(index);
    }

    public ArrayList<String> getMyPlaylist() {
        return myPlaylist;
    }
}

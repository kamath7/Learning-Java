package com.kamsinc;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean songAdded(String title, double duration){
        if(findSong(title) == null){
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for (Song checkSong: this.songs){
            if(checkSong.getTitle().equals(title)){
                return checkSong;
            }
        }
        return null;
    }

}

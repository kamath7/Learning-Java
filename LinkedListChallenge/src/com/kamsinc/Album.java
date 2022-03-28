package com.kamsinc;

import java.util.ArrayList;
import java.util.LinkedList;

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

    public boolean addToPlaylist(int trackNo, LinkedList<Song> playList){
        int index = trackNo - 1;
        if(index >= 0 && (index <=this.songs.size())){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("Album currently empty");
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList){
        Song checkSong = findSong(title);
        if (checkSong !=null){
            playList.add(checkSong);
            return  true;
        }
        System.out.println("Song not present in the album");
        return  false;
    }

}

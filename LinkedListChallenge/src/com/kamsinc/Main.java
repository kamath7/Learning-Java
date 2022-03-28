package com.kamsinc;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    final private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
	// write your code here

        Album myAwesomeAlbum = new Album("Awesome Album","Kams");
        myAwesomeAlbum.songAdded("Hello World",4.5);
        myAwesomeAlbum.songAdded("F this shit",3.2);
        myAwesomeAlbum.songAdded("Merry go Round",3.5);

        albums.add(myAwesomeAlbum);

        Album mySecondAwesomeAlbum = new Album("Deafen","Kams Also");
        mySecondAwesomeAlbum.songAdded("Great Tune",3.2);
        mySecondAwesomeAlbum.songAdded("Street Troops",4.5);
        mySecondAwesomeAlbum.songAdded("Sharkinator",3.1);
        albums.add(mySecondAwesomeAlbum);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("Hello World",playList);
        albums.get(1).addToPlaylist("Street Troops",playList);
        albums.get(0).addToPlaylist("Mountain Dew",playList);
        albums.get(0).addToPlaylist(2,playList);


    }
}

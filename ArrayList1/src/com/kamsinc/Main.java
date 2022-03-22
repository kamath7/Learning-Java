package com.kamsinc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //List is an interface
        //ArrayList - handles size internally. no need to mention
        //Also arraylist is a class which implements the List interface
        ArrayList<String> myArrayList = new ArrayList<String>(); //<String> - type

        myArrayList.add("Milk");
        myArrayList.add("Grapes");
        myArrayList.add("Eggs");
        myArrayList.add("Paneer");
        myArrayList.add("Spices");

        System.out.println(myArrayList);

        Playlist playlist = new Playlist();

        playlist.addSong("Fade into darkness");
        playlist.addSong("In the end");
        playlist.addSong("Poker Face");

        System.out.println(playlist.getMyPlaylist());

        playlist.deleteSong(1);

        System.out.println(playlist.getMyPlaylist());

        System.out.println(playlist.findSong("Poker Face"));
    }
}

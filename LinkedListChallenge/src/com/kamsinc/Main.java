package com.kamsinc;

import java.util.*;

public class Main {

    final private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        // write your code here

        Album myAwesomeAlbum = new Album("Awesome Album", "Kams");
        myAwesomeAlbum.songAdded("Hello World", 4.5);
        myAwesomeAlbum.songAdded("F this shit", 3.2);
        myAwesomeAlbum.songAdded("Merry go Round", 3.5);

        albums.add(myAwesomeAlbum);

        Album mySecondAwesomeAlbum = new Album("Deafen", "Kams Also");
        mySecondAwesomeAlbum.songAdded("Great Tune", 3.2);
        mySecondAwesomeAlbum.songAdded("Street Troops", 4.5);
        mySecondAwesomeAlbum.songAdded("Sharkinator", 3.1);
        albums.add(mySecondAwesomeAlbum);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("Hello World", playList);
        albums.get(1).addToPlaylist("Street Troops", playList);
        albums.get(0).addToPlaylist("Mountain Dew", playList);
        albums.get(0).addToPlaylist(2, playList);

        playSongs(playList);
    }

    private static void playSongs(LinkedList<Song> playList) {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean isForward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs to play");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());//to string because here we;re showing an object

        }

        while (!quit) {
            int act = scanner.nextInt();
            scanner.nextLine();

            switch (act) {
                case 0:
                    System.out.println("Playlist complete!");
                    quit = true;
                    break;
                case 1:
                    if (!isForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        isForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Playing " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached end of the playlist");
                        isForward = false;
                    }
                    break;
                case 2:
                    if (isForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        isForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Playing - " + listIterator.previous().toString());
                    } else {
                        System.out.println("Reached the start of the playList");
                    }
                    break;
                case 3:
                    if(isForward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Replaying "+listIterator.previous().toString());
                            isForward = false;
                        }else{
                            System.out.println("Start of list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Replaying "+listIterator.next().toString());
                            isForward = true;
                        }else {
                            System.out.println("Reached end of list");
                        }
                    }
                    break;
                case 4:
                    printPlayList(playList);
                    break;
                case 5: if(playList.size() == 0){
                    listIterator.remove();
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+listIterator.next());
                    }else if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous());
                    }
                }
                    break;
                default:
                    System.out.println("Check entered number");
                    break;

            }
        }
    }

    private static void printPlayList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

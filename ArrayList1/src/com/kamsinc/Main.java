package com.kamsinc;
import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //List is an interface
        //ArrayList - handles size internally. no need to mention
        //Also arraylist is a class which implements the List interface
//        ArrayList<String> myArrayList = new ArrayList<String>(); //<String> - type
        Playlist playlist = new Playlist();
        boolean userActive = true;
        while(userActive){
            System.out.println("Enter your choice. 1 for add, 2 for getting your playlist, 3 for deleting a song, 4 for finding a song. -1 to quit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    System.out.println("Add Song name");
                    String song = scanner.nextLine();
                    playlist.addSong(song);
                    break;
                case 2:
                    System.out.println("Your playlist below");
                    System.out.println(playlist.getMyPlaylist());
                    break;
                case 3:
                    System.out.println("Enter song name to be removed");
                    String songName2 = scanner.nextLine();
                    if (!playlist.deleteSong(songName2)){
                        System.out.println("Deletion failed. Song doesn't exist");
                    }else{
                        System.out.println(songName2+" deleted from playlist!");
                        System.out.println("Playlist after deletion "+playlist.getMyPlaylist());
                    }
                    break;
                case 4:
                    System.out.println("Enter songname to search");
                    String songName = scanner.nextLine();
                    System.out.println(playlist.findSong(songName));
                    break;
                case -1: userActive = false;
                    break;
                default:
                    System.out.println("Check what you have entered again!");
                    break;
            }
        }
//        myArrayList.add("Milk");
//        myArrayList.add("Grapes");
//        myArrayList.add("Eggs");
//        myArrayList.add("Paneer");
//        myArrayList.add("Spices");

//        System.out.println(myArrayList);
//
//
//        playlist.addSong("Fade into darkness");
//        playlist.addSong("In the end");
//        playlist.addSong("Poker Face");
//
//        System.out.println(playlist.getMyPlaylist());
//
//        playlist.deleteSong(1);
//
//        System.out.println(playlist.getMyPlaylist());
//
//        System.out.println(playlist.findSong("Poker Face"));
    }
}

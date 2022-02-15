package com.kamathinc;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(69, 45));
    }

    public static String getDurationString(int minutes, int seconds){

        if ( minutes >= 0 && (seconds >=0 && seconds <=59) ){

            int hours = minutes/60;
            int remainingMinutes = minutes % 60;
            return hours + " hh " + remainingMinutes+" mm "+ seconds+" ss ";
        }
        return "Invalid Value";
    }
    public static String getDurationString( int seconds){
        return "Invalid Value";
    }
}

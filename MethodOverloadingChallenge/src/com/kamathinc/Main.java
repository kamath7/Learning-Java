package com.kamathinc;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(69, 45));
        System.out.println(getDurationString(86400));
    }

    public static String getDurationString(int minutes, int seconds){

        if ( minutes >= 0 && (seconds >=0 && seconds <=59) ){

            int hours = minutes/60;
            int remainingMinutes = minutes % 60;
            String hourString = hours + " hh";
            String minuteString = remainingMinutes + " mm";
            String secondsString = seconds + " hh";

            if (hours < 10){
                hourString = "0"+hourString;
            }
            if (remainingMinutes < 10){
                minuteString = "0"+minuteString;
            }
            if (seconds < 10){
                secondsString = "0"+secondsString;
            }
            return hourString +" "+ minuteString+" "+ secondsString;
        }
        return "Invalid Value";
    }
    public static String getDurationString( int seconds){
        if (  seconds >=0 ){
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;

           return getDurationString(minutes, remainingSeconds);
        }

        return "Invalid Value";
    }
}

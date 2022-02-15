package com.kamathinc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Method Overloading");
        calculateScore("Kams",200);
        System.out.println("New score would be "+calculateScore("Ronaldo",7));
        System.out.println("Default score - "+calculateScore(10));
        System.out.println("Score with multiplier "+calculateScore("Rooney",10, 2));
        System.out.println("No player no score - "+calculateScore());
        System.out.println("Total cms for 5 foot 11 inches "+calcFeetAndInchesToCentimeters(5, 11));
    }
// To overload you need to change the number of parameters. changing the return type won't do anything
    public static int calculateScore(String playerName, int score){
        System.out.println("Player "+playerName+" has scored "+score+ "points");
        return score * 1000;
    }

    public static int calculateScore( int score){
        System.out.println("Player anonymous has scored"+score+ "points");
        return score * 1000;
    }

    public static int calculateScore(String playerName, int score, int multiplier){
        System.out.println("Player "+playerName+" has scored "+score+ "points");
        return score * multiplier;
    }

    public static int calculateScore(){
        System.out.println("Player anonymous has scored 1 point");
        return 1;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet >= 0.0 && inches >=0.0 ){
            double totalInches = 0;
            totalInches = feet*12;
            totalInches += inches;
            return calcFeetAndInchesToCentimeters(totalInches);
        }

        return -1.0;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){

        if(inches >= 0.0){
            return inches * 2.54;
        }

        return -1.0;
    }
}

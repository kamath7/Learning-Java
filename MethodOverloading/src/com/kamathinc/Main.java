package com.kamathinc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Method Overloading");
        calculateScore("Kams",200);
        System.out.println("New score would be "+calculateScore("Ronaldo",7));
        System.out.println("Default score - "+calculateScore(10));
        System.out.println("Score with multiplier "+calculateScore("Rooney",10, 2));
    }

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
}

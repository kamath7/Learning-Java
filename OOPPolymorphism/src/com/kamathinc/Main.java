package com.kamathinc;


class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "Undefined plot";
    }
}

class FightClub extends  Movie{
    public FightClub(){
        super("Fight Club");
    }

    public String plot(){
        return "Two guys fight and make soap";
    }
}



public class Main {


    public static void main(String[] args) {
	// write your code here


    }
}

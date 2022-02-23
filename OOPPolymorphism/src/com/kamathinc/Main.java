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

class UsualSuspects extends Movie{
    public UsualSuspects(){
        super("Usual Suspects");
    }
    @Override
    public String plot(){
        return "Handicapped guy makes a fool of the police";
    }
}

class Birbal extends Movie{
    public Birbal(){
        super("Birbal");
    }
    public String plot(){
        return "Finding a killer who did a murder 8 years ago";
    }
}

class BoneHunter extends Movie{
    public BoneHunter(){
        super("Bone Hunter");
    }
    public String plot(){
        return "Serial killer on the loose who likes bones";
    }
}

class ForgottenMovie extends  Movie{
    public ForgottenMovie(){
        super("Don't remember the name :( ");
    }
}





public class Main {


    public static void main(String[] args) {
	// write your code here


    }
}

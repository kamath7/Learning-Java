package com.kamathinc;


class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "Undefined plot";
    }
}

class FightClub extends Movie {
    public FightClub() {
        super("Fight Club");
    }

    public String plot() {
        return "Two guys fight and make soap";
    }
}

class UsualSuspects extends Movie {
    public UsualSuspects() {
        super("Usual Suspects");
    }

    @Override
    public String plot() {
        return "Handicapped guy makes a fool of the police";
    }
}

class Birbal extends Movie {
    public Birbal() {
        super("Birbal");
    }

    public String plot() {
        return "Finding a killer who did a murder 8 years ago";
    }
}

class BoneHunter extends Movie {
    public BoneHunter() {
        super("Bone Hunter");
    }

    public String plot() {
        return "Serial killer on the loose who likes bones";
    }
}

class ForgottenMovie extends Movie {
    public ForgottenMovie() {
        super("Don't remember the name :( ");
    }
}

public class Main {
    public static void main(String[] args) {
        // write your code here

        for (int i = 1; i < 11; i++) {
            Movie movie = giveMeAMovie();
            System.out.println("Move no. " + i + " - " + movie.getName() + "\nThe plot of the movie - " + movie.plot() + "\n");
        }
    }

    public static Movie giveMeAMovie() {
        int randomNum = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was " + randomNum);
        switch (randomNum) {
            case 1:
                return new FightClub();
            case 2:
                return new UsualSuspects();
            case 3:
                return new Birbal();
            case 4:
                return new BoneHunter();
            case 5:
                return new ForgottenMovie();
        }

        return null;
    }
}

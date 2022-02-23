package com.kamathinc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player = new Player();
        player.name = "Doom Slayer";
        player.health = 100;
        player.weapon = "everything";

        player.loseHealth(11);
        System.out.println(player.healthRemaining());

        player.loseHealth(11);
        System.out.println(player.healthRemaining());

        EncapPlayer encapPlayer = new EncapPlayer("Doom Slayer",100, "Sword");
        System.out.println(encapPlayer.getHealth());
        encapPlayer.loseHealth(10);
        System.out.println(encapPlayer.getHealth());
    }
}

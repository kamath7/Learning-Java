package com.kamathinc;

/**
 * Created by Ganesh on 23-02-2022.
 */
public class EncapPlayer {
    private String name;
    private int playerHealth;
    private String weapon;

    public EncapPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health >0 && health <=100){
            this.playerHealth = 100;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.playerHealth -= damage;
        if(this.playerHealth <=0){
            System.out.println("Player dead :( ");

        }else{
            System.out.println("Player is hit. Health is now at "+this.playerHealth);
        }
    }

    public int getHealth() {
        return playerHealth;
    }


}

package com.kamathinc;

/**
 * Created by Ganesh on 23-02-2022.
 */
public class EncapPlayer {
    private String name;
    private int health;
    private String weapon;

    public EncapPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health >0 && health <=100){
            this.health = 100;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <=0){
            System.out.println("Player dead :( ");

        }else{
            System.out.println("Player is hit. Health is now at "+this.health);
        }
    }

    public int getHealth() {
        return health;
    }


}

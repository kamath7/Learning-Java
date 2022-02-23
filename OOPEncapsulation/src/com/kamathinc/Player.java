package com.kamathinc;

/**
 * Created by Ganesh on 23-02-2022.
 */
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health <=0){
            System.out.println("Player dead :( ");

        }else{
            System.out.println("Player is hit. Health is now at "+this.health);
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}

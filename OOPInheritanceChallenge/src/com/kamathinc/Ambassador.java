package com.kamathinc;

/**
 * Created by Ganesh on 22-02-2022.
 */
public class Ambassador extends Car {
    private int monthsUsed;

    public Ambassador(int monthsUsed) {
        super("Ambassador", 4, 4, 4, 3, false, 1);
        this.monthsUsed = monthsUsed;
    }

    public void accelatate(int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0 ){
            stop();
        }else if(newVelocity > 0 && newVelocity <=10){
            setCurrentGear(2);
        }else if(newVelocity > 10 && newVelocity <=20){
            setCurrentGear(3);
        }else if(newVelocity > 20 && newVelocity <=45){
            setCurrentGear(4);
        }else{
            setCurrentGear(5);
        }

        if (newVelocity > 0){
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}

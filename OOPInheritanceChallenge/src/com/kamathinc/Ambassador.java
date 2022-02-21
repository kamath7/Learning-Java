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
}

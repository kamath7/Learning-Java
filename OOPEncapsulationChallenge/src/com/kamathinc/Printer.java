package com.kamathinc;

/**
 * Created by Ganesh on 23-02-2022.
 */
public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.pagesPrinted = pagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int tonerAddition){
        if(this.tonerLevel + tonerAddition > 100){
            System.out.println("Max you can fill up is 100");
        }else{
            this.tonerLevel += tonerAddition;
        }
    }
}

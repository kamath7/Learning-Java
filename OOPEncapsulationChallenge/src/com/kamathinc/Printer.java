package com.kamathinc;

/**
 * Created by Ganesh on 23-02-2022.
 */
public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {

        if(tonerLevel > -1 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int tonerAddition){
        if(tonerAddition > 0 && tonerAddition <=100){
            if(this.tonerLevel + tonerAddition > 100){
                System.out.println("Max you can fill up is 100!");
            }else{
                this.tonerLevel += tonerAddition;
                System.out.println("Toner level now at "+this.tonerLevel);
            }
        }else{
            System.out.println("Invalid amount specified to add!");
        }

    }

    public void printPages(int pages){
        if(this.isDuplex){
            pages = pages/2;
            this.pagesPrinted += pages;
        }else{
            this.pagesPrinted += pages;
        }
        System.out.println("Pages printed now stands at "+this.pagesPrinted);
    }

}

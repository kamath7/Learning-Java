package com.kamathinc;

/**
 * Created by Ganesh on 23-02-2022.
 */
public class Bed {
    private String bedType;
    private int noPillows;
    private int height;
    private int blanketCount;

    public Bed(String bedType, int noPillows, int height, int blanketCount) {
        this.bedType = bedType;
        this.noPillows = noPillows;
        this.height = height;
        this.blanketCount = blanketCount;
    }

    public void make(){
        System.out.println("Making it. from Bed class");
    }

    public String getBedType() {
        return bedType;
    }

    public int getNoPillows() {
        return noPillows;
    }

    public int getHeight() {
        return height;
    }

    public int getBlanketCount() {
        return blanketCount;
    }
}

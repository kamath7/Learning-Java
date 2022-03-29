package com.kamsinc;

import java.util.ArrayList;
import java.util.List;

public class Demon implements  ISaveable{

    private String name;
    private int hitPts;
    private int strength;

    public Demon(String name, int hitPts, int strength) {
        this.name = name;
        this.hitPts = hitPts;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPts() {
        return hitPts;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Demon{" +
                "name='" + name + '\'' +
                ", hitPts=" + hitPts +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1,""+this.hitPts);
        values.add(2,""+this.strength);

        return values;
    }

    @Override
    public void read(List<String> values) {
        if(values !=null && values.size() > 0){
            this.name = values.get(0);
            this.hitPts = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
        }
    }
}

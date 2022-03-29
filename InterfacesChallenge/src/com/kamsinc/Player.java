package com.kamsinc;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{
    private String name;
    private int hitPts;
    private int strength;
    private String weaponName;

    public Player(String name, int hitPts, int strength) {
        this.name = name;
        this.hitPts = hitPts;
        this.strength = strength;
        this.weaponName = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPts() {
        return hitPts;
    }

    public void setHitPts(int hitPts) {
        this.hitPts = hitPts;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    @Override
    public String toString() {
        return "Player - "+name+" Hit Points - "+hitPts+" Strength - "+strength+" Weapon - "+weaponName;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1,""+this.hitPts);
        values.add(2,""+this.strength);
        values.add(3,this.weaponName);
        return values;
    }

    @Override
    public void read(List<String> values) {
        if(values !=null && values.size() > 0){
            this.name = values.get(0);
            this.hitPts = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
            this.weaponName = values.get(3);
        }
    }
}

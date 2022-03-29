package com.kamsinc;

import java.util.ArrayList;

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
    public ArrayList<String> write() {
        return null;
    }

    @Override
    public void read(ArrayList<String> values) {

    }
}

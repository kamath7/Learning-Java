package com.kamsinc;

public class DeskPhone implements ITelephone {

    private int phoneNumber;
    private boolean phoneRinging;

    @Override
    public void powerOn() {

    }

    @Override
    public void dial(int phoneNumber) {

    }

    @Override
    public void answer() {

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        return false;
    }

    @Override
    public boolean phoneRinging() {
        return false;
    }
}

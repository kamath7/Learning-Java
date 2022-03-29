package com.kamsinc;

public class DeskPhone implements ITelephone {

    private int myPhoneNumber;
    private boolean phoneRinging;

    @Override
    public void powerOn() {
        System.out.println("Phone is always present. Phone always on!");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Phone now ringing. Call by "+phoneNumber);
    }

    @Override
    public void answer() {
        if (phoneRinging){
            System.out.println("Phone being answered now!");
            this.phoneRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myPhoneNumber){
            phoneRinging = true;
            System.out.println("TRING TRING");
        }else{
            phoneRinging = false;
        }
        return false;
    }

    @Override
    public boolean phoneRinging() {
        return this.phoneRinging;
    }

    public DeskPhone(int myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
    }
}

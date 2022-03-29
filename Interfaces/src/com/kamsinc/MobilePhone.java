package com.kamsinc;

public class MobilePhone implements  ITelephone{

    private int myPhoneNumber;
    private boolean phoneRinging;
    private boolean isTurnedOn = false;
    @Override
    public void powerOn() {
        isTurnedOn = true;
        System.out.println("Phone is now turned on!");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isTurnedOn){
            System.out.println("Phone now ringing. Call by "+phoneNumber);
        }else{
            System.out.println("Phone switched off");
        }
    }

    @Override
    public void answer() {
        if (phoneRinging){
            System.out.println("Phone being answered now!");
            this.phoneRinging = false;
        }
    }

    public MobilePhone(int myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myPhoneNumber && isTurnedOn){
            phoneRinging = true;
            System.out.println("TRING TRING MF");
        }else{
            phoneRinging = false;
        }
        return false;
    }

    @Override
    public boolean phoneRinging() {
        return this.phoneRinging;
    }


}

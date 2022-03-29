package com.kamsinc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Methods are specified that a particular class must implement - Interface
        ITelephone somePhone;
        somePhone = new DeskPhone(7787290);
        somePhone.powerOn();
        somePhone.callPhone(1289099);
        somePhone.answer();

        somePhone = new MobilePhone(12123455);
        somePhone.callPhone(222331);
        somePhone.phoneRinging();


    }
}

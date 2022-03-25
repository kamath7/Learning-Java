package com.kamsinc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bank bank = new Bank("SBI");

        bank.addBranch("Mangalore");
        bank.adCustomer("Mangalore","Adi",78.69);
        bank.adCustomer("Mangalore","Joker",178.69);
        bank.adCustomer("Mangalore","Enrique",8.69);

        bank.addBranch("Bangalore");
        bank.adCustomer("Bangalore","Poop",78.69);
        bank.adCustomer("Bangalore","Piss",178.69);
        bank.adCustomer("Bangalore","Shit",8.69);

        bank.addCustTransaction("Mangalore", "Adi", 150.00);
        bank.addCustTransaction("Mangalore", "Adi", 150.00);

        bank.listCustomers("Bangalore", false);
        bank.listCustomers("Bangalore", true);

        bank.listCustomers("Mangalore", true);


    }
}

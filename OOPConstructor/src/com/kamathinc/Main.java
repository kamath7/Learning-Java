package com.kamathinc;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount myAccount = new BankAccount();

        myAccount.setAccountBalance(1000);
        System.out.println(myAccount.getAccountBalance());
        myAccount.withDraw(900);
        System.out.println(myAccount.getAccountBalance());
        myAccount.withDraw(1000);
        System.out.println(myAccount.getAccountBalance());
        myAccount.deposit(1000);
        myAccount.withDraw(1000);
        System.out.println(myAccount.getAccountBalance());

        BankAccount newAcct  = new BankAccount(1000,9000, "Some Great account", "a@a.com","+917890827910");
        System.out.println(newAcct.getAccountBalance());
    }
}

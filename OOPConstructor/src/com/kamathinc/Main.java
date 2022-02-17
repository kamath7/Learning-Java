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

        BankAccount anotherAcct = new BankAccount("Kams","kam@kam.com","+917867281909");
        System.out.println(anotherAcct.getCustomerName()+" has "+anotherAcct.getAccountBalance());

        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName()+ " has credit limit "+vipCustomer.getCreditLimit()+" and email is "+vipCustomer.getEmailAddress());

        VipCustomer vipCustomer1 = new VipCustomer("Amitabh Bachan",420);
        System.out.println(vipCustomer1.getName()+ " has credit limit "+vipCustomer1.getCreditLimit()+" and email is "+vipCustomer1.getEmailAddress());

        VipCustomer vipCustomer2 = new VipCustomer("Jagga",100, "jagga@jagga.com");
        System.out.println(vipCustomer2.getName()+ " has credit limit "+vipCustomer2.getCreditLimit()+" and email is "+vipCustomer2.getEmailAddress());


    }
}

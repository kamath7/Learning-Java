package com.kamathinc;

/**
 * Created by Ganesh on 17-02-2022.
 */
public class BankAccount {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String emailAddress;
    private String phoneNumber;

    public BankAccount(){
        this(889,1000, "Lalle","b@b.com","+91828182039"); //special use of this. calling another constructor. this has to be the first statement
        System.out.println("Constructor - 1");
    }
    //Overloading that's all
    public BankAccount(int accountNumber, double accountBalance, String customerName, String emailAddress, String phoneNumber){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void withDraw(int amount){
        if(this.accountBalance-amount < 0){
            System.out.println(amount+" cannot be withdrawn.");
        }else{
            this.accountBalance -= amount;
            System.out.println(amount+" has been withdrawn. Current balance is "+this.accountBalance);
        }

    }

    public void deposit (int amount){
        this.accountBalance += amount;
        System.out.println(amount+" has been withdrawn. Current balance is "+this.accountBalance);
    }
}

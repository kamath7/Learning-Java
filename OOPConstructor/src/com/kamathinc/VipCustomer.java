package com.kamathinc;

/**
 * Created by Ganesh on 17-02-2022.
 */
public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this("John Doe",100, "doe@doe.com");
    }

    public VipCustomer(String name, int creditLimit, String emailAddress) {

        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "doe@doe.com");
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

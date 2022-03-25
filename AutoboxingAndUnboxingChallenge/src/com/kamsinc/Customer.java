package com.kamsinc;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    public String getName() {
        return name;
    }

    public  void addTransaction(double amt){
        this.transactions.add(amt);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}

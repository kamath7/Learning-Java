package com.kamsinc;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public String getBranchName() {
        return branchName;
    }

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();

    }

    public boolean addCustoer(String custName, double initialAmt){

        if (findCustomer(custName) == null){
            this.customers.add(new Customer(custName, initialAmt));
            return true;
        }
        System.out.println("Customer already exists with that name");
        return false;
    }

    public boolean addCustTransaction(String custName, double amt){
        Customer oldCust = findCustomer(custName);
        if(oldCust){
            oldCust.addTransaction(amt);
            return  true;
        }
        return false;
    }

    private Customer findCustomer(String custName){
        for (int i =0 ; i < customers.size(); i++){
            Customer checkCust = this.customers.get(i);
            if(checkCust.getName().equals(custName)){
                return checkCust;
            }
        }
        return null;
    }
}

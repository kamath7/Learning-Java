package com.kamsinc;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean adCustomer(String branchName, String custName, double initialAmt){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return  branch.addCustoer(custName, 200.00); //this returns a boolean
        }
        return false;
    }
    private Branch findBranch(String branchName){

        return null;
    }
}

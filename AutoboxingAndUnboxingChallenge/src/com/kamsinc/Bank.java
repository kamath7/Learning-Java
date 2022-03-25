package com.kamsinc;

import java.util.ArrayList;

public class Bank {

    final private String name;
    final private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
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

    public boolean addCustTransaction(String branchName, String custName, double amt){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            return branch.addCustTransaction(custName, amt);
        }
        return  false;
    }
    private Branch findBranch(String branchName){
        for (int i =0 ; i < this.branches.size(); i++){
            Branch branch = this.branches.get(i);
            if(branch.getBranchName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch!=null){
            System.out.println("Customers for Branch - "+branch.getBranchName());
            ArrayList<Customer> branchCusts = branch.getCustomers();
            for (int i = 0 ; i < branchCusts.size();  i++){
                Customer branchCust = branchCusts.get(i);
                System.out.println(i+" - "+branchCust.getName());
                if(showTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> custTransactions = branchCust.getTransactions();
                    for(int j = 0 ; j < custTransactions.size() ; j++){
                        System.out.println(j+" -"+custTransactions.get(j).doubleValue());
                    }
                }
            }
            return true;
        }
        return false;
    }
}

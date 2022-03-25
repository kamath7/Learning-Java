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
}

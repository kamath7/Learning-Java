package com.kamsinc;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer("Adi",55.69);
        Customer customer1;

        customer1 = customer;
        customer1.setBalance(69.69);

        System.out.println("Balance of Cust1 -> "+customer.getBalance());
        System.out.println("Balance of Cust2 ->"+customer1.getBalance());

        ArrayList<Integer> myIntArr = new ArrayList<>();
        myIntArr.add(69);
        myIntArr.add(138);
        myIntArr.add(69);

        for(int i =0; i < myIntArr.size(); i++){
            System.out.println(i+" -> "+myIntArr.get(i));
        }
        myIntArr.add(1,35);

        for(int i =0; i < myIntArr.size(); i++){
            System.out.println(i+" -> "+myIntArr.get(i));
        }
    }
}

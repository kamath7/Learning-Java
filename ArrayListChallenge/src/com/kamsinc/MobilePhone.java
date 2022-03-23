package com.kamsinc;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public boolean addContact (Contact contact){
        if (findContact(contact.getName()) > 0){
            System.out.println("Contact already exists!");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int ifFound= findContact(oldContact);
        if (ifFound < 0){
            System.out.println("Contact doesn't exist to update!");
            return false;
        }
        this.myContacts.set(ifFound, newContact);
        System.out.println(oldContact.getName()+" changed to "+newContact.getName()+" "+newContact.getPhoneNumber());
        return true;
    }
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }
    private int findContact(String name){ //Overloading
        for(int i = 0 ; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
}

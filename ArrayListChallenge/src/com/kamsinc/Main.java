package com.kamsinc;

import java.util.Scanner;

public class Main {

    final static private Scanner scanner = new Scanner(System.in);
    final static private MobilePhone mobilePhone = new MobilePhone("+918176893710");

    public static void main(String[] args) {
	// write your code here
        boolean userStop = false;

        while(!userStop){
            System.out.println("Enter a choice");
            int choice =  scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                        if(mobilePhone.getMyContacts() != null){
                            System.out.println(mobilePhone.getMyContacts());
                        }else{
                            System.out.println(" No contacts yet!");
                        }
                        break;
                case 2:
                        System.out.println("Enter the contact name you want to add");
                        String contactName = scanner.nextLine();
                        System.out.println("Enter the contact number you want to add");
                        String phoneNumber = scanner.nextLine();
                        Contact myCont = new Contact(contactName, phoneNumber);
                        System.out.println(myCont.getName());
                        if(mobilePhone.addContact(myCont)){
                            System.out.println("Successfully added");
                        }else{
                            System.out.println("Contact already exists!");
                        }
                        break;

                case 3:
                    System.out.println("Enter existing contact name and number to modify ");
                    String oldContactName = scanner.nextLine();
                    String oldContactNumber = scanner.nextLine();
                    System.out.println("Enter new contact name and number");
                    String newContactName = scanner.nextLine();
                    String newContactNumber = scanner.nextLine();
                    if(mobilePhone.updateContact(new Contact(oldContactName, oldContactNumber), new Contact(newContactName, newContactNumber))){
                        System.out.println("Completed!");
                    }else{
                        System.out.println("Check again!");
                    }
                    break;
                case 4:
                    System.out.println("Enter contact name and number to be deleted");
                    String removeContactName = scanner.nextLine();
                    String removeContactNumber = scanner.nextLine();
                    if (!mobilePhone.removeContact(new Contact(removeContactName, removeContactNumber))){
                        System.out.println("Check your input again!");
                        break;
                    }else{
                        System.out.println("Successfully completed!");
                    }
                    break;
                case 5:
                    System.out.println("Enter contact name and number to be queried");
                    String queryContactName = scanner.nextLine();
                    String queryeContactNumber = scanner.nextLine();
                    if(mobilePhone.queryContact(new Contact(queryContactName, queryeContactNumber)) !=null){
                        System.out.println("Found!");
                    }else{
                        System.out.println("Not found! Check again");
                    }
                    break;
                case -1:
                    System.out.println("Phone shutting down");
                    userStop = true;
                    break;
                default:
                    System.out.println("Check your choice again!");
                    break;

            }
        }

    }
}

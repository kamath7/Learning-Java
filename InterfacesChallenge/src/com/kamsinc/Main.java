package com.kamsinc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Player somePlayer = new Player("Kams",122,100);
        System.out.println(somePlayer.toString());
        saveObject(somePlayer);

        somePlayer.setHitPts(10);
        System.out.println(somePlayer);
        somePlayer.setWeaponName("Desert Eagle");

        saveObject(somePlayer);
//        loadObject(somePlayer);

        System.out.println(somePlayer);

        ISaveable chimera = new Demon("Chimera",11,22);
        System.out.println(chimera);
        //to access getters
        System.out.println(((Demon)chimera).getStrength());
        saveObject(chimera);

    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable obj){
        for (int i = 0 ; i < obj.write().size(); i++){
            System.out.println("Saving "+obj.write().get(i));
        }
    }

    public static void loadObject(ISaveable obj){
        ArrayList<String> values  = readValues();
        obj.read(values);
    }
}

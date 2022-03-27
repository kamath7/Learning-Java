package com.kamsinc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class MyLL {

    public static void main(String[] args) {
        LinkedList<String> somePlaces = new LinkedList<>();

//        somePlaces.add("Hampi");
//        somePlaces.add("Mangalore");
//        somePlaces.add("Gokarna");
//        somePlaces.add("Rio De Janeiro");
        checkOrder("Hampi",somePlaces);
        checkOrder("Mangalore",somePlaces);
        checkOrder("Gokarna",somePlaces);
        checkOrder("Rio De Janeiro",somePlaces);

        printMyList(somePlaces);

        checkOrder("Dehradun",somePlaces);
        checkOrder("Gokarna",somePlaces);

        printMyList(somePlaces);

        visitPlace(somePlaces);
    }

    private static void printMyList(LinkedList<String> places){
        Iterator<String> i = places.iterator();
        while(i.hasNext()){
            System.out.println("Visiting - "+i.next());
        }
    }

    private  static void visitPlace(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean userToQuit = false;
        boolean checkForLoops = true;

        ListIterator<String> stringListIterator = cities.listIterator();
        if(cities.isEmpty()){
            System.out.println("No cities in yet!");
            return;
        }else {
            System.out.println("Visiting - "+stringListIterator.next());
        }
        while(!userToQuit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Holiday done! :( ");
                    userToQuit = true;
                    break;
                case 1:
                    if(!checkForLoops){
                        if(stringListIterator.hasNext()){
                            stringListIterator.next();
                        }
                        checkForLoops = true;//going forward
                    }
                    if(stringListIterator.hasNext()){
                        System.out.println("Visiting "+stringListIterator.next());
                    }else {
                        System.out.println("Reached the end of itinerary!");

                        checkForLoops= false;
                    }
                    break;
                case 2:
                    if(checkForLoops){
                        if(stringListIterator.hasPrevious()){
                            stringListIterator.previous();
                        }
                        checkForLoops = false; //going backward
                    }
                    if(stringListIterator.hasPrevious()){
                    System.out.println("Now visiting "+stringListIterator.previous());
                }else{
                    System.out.println("Start of the tour!");
                }
                case 3:
                    System.out.println("You can add/check itinerary");
                    break;

            }
        }
    }

    private static boolean checkOrder(String city, LinkedList<String> places){
            ListIterator<String> i = places.listIterator();
            while(i.hasNext()){
                int comparison = i.next().compareTo(city);
                if(comparison == 0 ){
                    //means they are equal
                    System.out.println(city+" cannot be added since it's already present!");
                    return false;
                }else if(comparison > 0){
                    //Maintaining alphabetical order
                    i.previous();
                    i.add(city);
                    return true;
                }else if(comparison < 0){
                    //need not do anything since next already done
                }

            }
            i.add(city);
            return true;
    }
}

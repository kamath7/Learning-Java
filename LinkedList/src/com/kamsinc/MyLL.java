package com.kamsinc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MyLL {

    public static void main(String[] args) {
        LinkedList<String> somePlaces = new LinkedList<>();

        somePlaces.add("Hampi");
        somePlaces.add("Mangalore");
        somePlaces.add("Gokarna");
        somePlaces.add("Rio De Janeiro");

        printMyList(somePlaces);

        somePlaces.add(1,"Ullal");

        printMyList(somePlaces);
    }

    private static void printMyList(LinkedList<String> places){
        Iterator<String> i = places.iterator();
        while(i.hasNext()){
            System.out.println("Visiting - "+i.next());
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

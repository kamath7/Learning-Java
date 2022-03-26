package com.kamsinc;

import java.util.Iterator;
import java.util.LinkedList;

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
}

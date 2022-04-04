package com.kamsinc;

public class Main {

    public static void main(String[] args) {

        SearchTree list = new SearchTree(null);
        list.traverse(list.getRoot());
        String someData = "Gokarna Mangalore Hampi Rio Miami Dispur Ayodhya";
        String[] data = someData.split(" ");
        for(String string: data){
            list.addItem(new Node(string));
        }

        list.traverse(list.getRoot());
    }
}

package com.kamathinc;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Printer printer = new Printer(30, false);

        System.out.println(printer.getPagesPrinted());

        printer.printPages(69);

        System.out.println(printer.getPagesPrinted());


        printer.fillToner(100);
        System.out.println(printer.getTonerLevel());
        printer.fillToner(50);
        System.out.println(printer.getTonerLevel());

    }
}

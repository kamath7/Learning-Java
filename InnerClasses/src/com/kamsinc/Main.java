package com.kamsinc;

import java.util.Scanner;

public class Main {

    final private static Scanner scanner = new Scanner(System.in);
    private  static Button someBtn = new Button("SomeBtn");
    public static void main(String[] args) {
        // write your code here

        Gearbox ferrari = new Gearbox(7);

        ferrari.operateClutch(true);
        ferrari.changeGear(1);
        ferrari.operateClutch(false);
        System.out.println(ferrari.changeWheelSpeed(900));
        ferrari.changeGear(2);
        System.out.println(ferrari.changeWheelSpeed(1000));
        ferrari.changeGear(3);
//        Gearbox.Gear first = ferrari.new Gear(1,12.3);
//        Gearbox.Gear second = ferrari.new Gear(2, 23.4);
//        Gearbox.Gear third = ferrari.new Gear(3, 27.2);
//
//        System.out.println(first.driveSpeed(1000));
//        System.out.println(second.driveSpeed(900));
//        System.out.println(third.driveSpeed(280));
//Anonymous class below
//        class ClickListener implements  Button.OnClickListener{
//            public ClickListener(){
//                System.out.println("Button attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.println(title+" clicked!");
//            }
//        }
//
//        someBtn.setOnClickListener(new ClickListener());
//    }
        someBtn.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title+" was clicked!");
            }
        });
//    private static void listen(){
//        boolean q = false;
//        while(!q){
//            int choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch(choice){
//                case 0:
//                    q = true;
//                    break;
//                case 1: someBtn.onClick();
//            }
//        }
//    }
    }
}

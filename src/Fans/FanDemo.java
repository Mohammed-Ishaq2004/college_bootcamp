package Fans;

import java.util.ArrayList;
import java.util.Scanner;

public class FanDemo {
    public static void main(String[] args) {

        ArrayList<Fan> fanArrayList = new ArrayList<>();

        int i = 1;
        while (i <= 180) {
            Fan f = new Fan();
            fanArrayList.add(f);
            i++;
        }
        System.out.println("Number of fans in warehouse: " + fanArrayList.size());
        Fan f1 = new Fan();
        Scanner sc = new Scanner(System.in);

        boolean outerrunning = true;
        while (outerrunning) {
            System.out.println("Enter fan number for testing (1–180) or -1 to exit: ");
            int fannum = sc.nextInt();

            if (fannum == -1) {
                System.out.println("Exiting the program...");
                outerrunning = false;
                break;
            }

            f1 = fanArrayList.get(fannum);
            boolean running = true;
            while (running == true) {
                System.out.println("--Fan controls--");
                System.out.println("1. Switch on the fan");
                System.out.println("2. Switch off the fan");
                System.out.println("3. Increase the fan speed");
                System.out.println("4. Decrease the fan spped");
                System.out.println("5.Select another fan");
                int choice = sc.nextInt();
                //1,2,3,4,5
                switch (choice) {
                    case 1 -> {
                        if (f1.isSwitchedON() == false) {
                            System.out.println("Starting the fan");
                            f1.switchOnTheFan();

                        } else {
                            System.out.println("Fan is already running");
                        }
//
                    }
                    case 2 -> {
                        f1.switchOfTheFan();
                        System.out.println("Fan is switched Off");
                    }
                    case 3 -> {
                        f1.increase();
                        System.out.println("Fan speed is : " + f1.getSpeed());

                    }
                    case 4 -> {
                        f1.decrease();
                        System.out.println("Fan speed is : " + f1.getSpeed());
                    }
                    case 5 -> {

                        running = false;

                        System.out.println("Testing over, Select another Fan");
                    }
                    case 6 -> {

                    }

                }
            }
//        if (f1.isSwitchedON() == false) {
//            f1.switchOnTheFan();
//        }
//        System.out.println("Speed of the fan when switched on is : " + f1.getSpeed());
//        f1.increase();
//        System.out.println("Speed of the fan on first increment : " + f1.getSpeed());
//        f1.increase();
//        System.out.println("Speed of the fan on second increment : " + f1.getSpeed());
//        f1.decrease();
//        System.out.println("Speed of the fan on first decrement : " + f1.getSpeed());
        }
    }
}


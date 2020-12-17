package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int number = s.nextInt();

        if (number == 0) {
            System.out.println("zero");
        }
        else if (number == 1) {
            System.out.println("one");
        }
        else if (number == 2) {
            System.out.println("two");
        }

        switch (number) {
            case 0: // if number == 0
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:// ... no break then continue with next one...
            case 4:
                System.out.println("three or four");
                break;
            default:
                System.out.println("not zero-one-two-three-four...");
        }

        String number_str = s.nextLine();
        // switch case from string to number..
        // "zero" --> print 0
        // "one" --> print 1
        // default --> print "unknown"


        System.out.println("Goodbye...");
    }
}

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

        String number_str = s.next();
        switch (number_str) {
            case "zero":
                System.out.println(0);
                break;
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case "three":
                System.out.println(3);
                break;
            case "four":
                System.out.println(4);
                break;
            default:
                System.out.println("unknown");
        }

        System.out.println("Goodbye...");
    }
}

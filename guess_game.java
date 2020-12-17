package com.company;

import java.util.Random;
import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {

        // while
        // do-while
        // while(true) .. do-while(true) .. break
        // 1. complicated 2. more than one condition
        // for
        // run over range of numbers

        Scanner s = new Scanner(System.in);
        Random r = new Random();

        // print 10 random numbers
        for(int index = 1; index <= 10; index++) {
            int random_number = r.nextInt(100) + 1; // 1-100
            System.out.print(random_number + " ");
        }

        // computer will random a number from 1-100
        // user will guess the number
        // if the user guessed too lower print: "guess higher"
        // if the user guessed too high  print: "guess lower"
        // if user guessed correctly then print "bingo" and exit
        // *etgar: print how many guesses, and allow no more than 5 guesses
        // which loop should be most suitable if you want 3 games? -- answer: for loop
        int lucky_number = r.nextInt(100) + 1; // 1-100
        int guesses = 0;
        while (true) {
            guesses++;
            System.out.println("Guess the number:");
            int guess = s.nextInt();
            if (guess > lucky_number) {
                System.out.println("Guess lower");
            }
            else if (guess < lucky_number) {
                System.out.println("Guess higher");
            }
            else {
                System.out.println("Bingo!");
                break;
            }
        }
        System.out.println(String.format("It took you %d guesses!", guesses));


        System.out.println("Goodbye...");
    }
}

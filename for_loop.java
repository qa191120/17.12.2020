package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // for loop
        // print 1..10

        int index = 1;
        while (index <= 10) {
            System.out.println(index);
            index++; // modify index .....
        }
        // int index = 1;  (index <= 10); index++;
        for (int index2 = 1; index2 <= 3; index2 -= 2)
        {
            System.out.println(index2);
            // all except modify index
            if (index2 < 10) {
                break;
            }
        }

        // 1. print all numbers from -10 to 10
        // 2. print all numbers divided by 7 from 7 to 104
        // 3. input number int from user ... print all from 1.. number
        // 4. input jump, max from user .. print 1 to max with jump
        //     example:
        //     max = 30
        //     jump = 4
        //     print from 1 to 30 and jump 4 each time
        // 5. ***etgar
        //    8 % 2 == 0
        //    9 % 2 == 1
        //    8 % 3 == 2
        //    9 % 3 == 0
        //    hint: if (number % index ==0 ) { ... }
        //    input number from user.
        //    print 1 to number all numbers which the given number
        //         is divided without module
        //    i.e. for 12:   1, 2, 3, 4, 6, 12


        System.out.println("Goodbye...");
    }
}

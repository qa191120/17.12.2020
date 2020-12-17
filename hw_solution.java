package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // write all numbers from -1000 to +1000 using do-while loop
        int index = -1000;
        do {
            System.out.println(index);
            index++;
        }
        while (index <= 1000);

        /*
             read oreh,rohav,hekef from user until the hekef was 2*oreh+2*rohav using do-while loop
               for exmaple:
               oreh=3, rohav=4, hekef=12 is wrong, since 3*2 + 4*2 = 14... so the user should input the numbers again
               oreh=1, rohav=5, hekef=12 is correct since 1*2 + 5*2 = 12... so the loop should end after this input
         */
        // oreh * 2 + rohav * 2 = hekef

        int oreh,rohav,hekef;
        int correct;
        do {
            System.out.println("Enter oreh, rohav and hekef:");
            oreh = s.nextInt();
            rohav = s.nextInt();
            hekef = s.nextInt();
            correct = oreh * 2 + rohav * 2;
        }
        //while (hekef != correct);
        while (hekef != oreh * 2 + rohav * 2);

        //now solve targil 1,2 to using while(true)+break loop
        // 1 while true
        // write all numbers from -1000 to +1000 using do-while loop
        int index_wt = -1000;
        while (true) {
            System.out.println(index_wt);
            index_wt++;
            if (index_wt > 1000) {
                break;
            }
        }

        // 2 while true
        // oreh * 2 + rohav * 2 = hekef

        int oreh_wt,rohav_wt,hekef_wt;
        int correct_wt;
        do {
            System.out.println("Enter oreh, rohav and hekef:");
            oreh_wt = s.nextInt();
            rohav_wt = s.nextInt();
            hekef_wt = s.nextInt();
            correct_wt = oreh_wt * 2 + rohav_wt * 2;
            if (hekef_wt == correct_wt) {
                break;
            }
        }
        //while (hekef_wt != correct_wt);
        while (true);

        /*
            read temperature from user (float)
           if temperature < 35 print "out-of-range" + break
           if temperature > 42 print "out-of-range" + break
           if temperature > 37.5 and temperature <= 42 print "sick"
           if temperature > 35 and temperature <= 37.5 print "healthy"
           use while (true) + break
         */
        float temperature;
        while (true) {
            System.out.println("Enter your temperature");
            temperature = s.nextFloat();
            if (temperature < 35 || temperature > 42) {
                System.out.println("Out of range");
                break;
            }
            if (temperature > 37.5 && temperature <= 42) {
                System.out.println("sick... go  to doctor");
                continue; // jumps to while condition
            }
            // temperature > 35 and temperature <= 37.5
            System.out.println("Healthy");
        }

        System.out.println("Goodbye...");
    }
}

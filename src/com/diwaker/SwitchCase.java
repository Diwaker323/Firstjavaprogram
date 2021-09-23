package com.diwaker;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        int day =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        day = sc.nextInt();

        switch (day)
        {
            case 1:
                if (day  == 1)
                System.out.println("Monday");
                break;
            case 2:
                if(day == 2)
            {
                System.out.println("Tuesday");

            }
                break;
            case 3:
                if(day == 3)
                {
                    System.out.println("Wednesday");
                    break;
                }
            case 4:
                if(day == 4)
                {
                    System.out.println("Thrusday");
                    break;
                }
            case 5:
                if(day == 5)
                {
                    System.out.println("Friday");
                }
                break;
            case 6:
            {
                System.out.println("Saturday");
            }
                break;
            default:
                System.out.println("Sunday");
        }
    }
}

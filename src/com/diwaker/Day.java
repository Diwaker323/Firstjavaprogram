package com.diwaker;
import java.util.Scanner;

public class Day {
    public static void main(String[] args){
        int day = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        day = sc.nextInt();
        if(day == 1)
        {
            System.out.println("Monday" );
        }
        else if(day == 2)
        {
            System.out.println("Tuesday");
        }
        else if(day ==3)
        {
            System.out.println("Wednesday");
        }
        else if(day == 4)
        {
            System.out.println("Thrusday");
        }
        else if(day == 5)
        {
            System.out.println("Friday");
        }
        else if(day == 6)
        {
            System.out.println("Satuday");
        }
        else
        {
            System.out.println("Sunday");
        }
    }
}

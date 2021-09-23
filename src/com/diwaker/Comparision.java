package com.diwaker;
// write a program to find largest of three number using
//logical operator
import java.util.Scanner;
public class Comparision {
    public static void main(String[] args){
        int a, b, c;
        System.out.println("Enter the First Number for Comparision");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter the Second Number For Comparision");
        b = sc.nextInt();
        System.out.println("Enter the Third Number For Comparision");
        c = sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("A is Greater");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is Greater");
        }
        else
        {
            System.out.println("C is Greater");
        }
    }
}

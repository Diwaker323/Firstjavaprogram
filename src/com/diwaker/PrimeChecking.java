package com.diwaker;

import java.util.Scanner;

public class PrimeChecking {
    public static void main(String[] args){
        int n,i,j,flag=0;
        System.out.println("Enter the number which is greater than 2");
        System.out.println("Enter the Number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=2;i<n;i++)
        {
             if(n/i!=0)
             {
                 flag = 1;

             }

        }
        if(flag==1)
        {
            System.out.println("Not Prime");
        }
        else
        {
            System.out.println("Prime");
        }
    }

}

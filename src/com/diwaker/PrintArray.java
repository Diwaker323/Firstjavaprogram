package com.diwaker;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args){
       int[][] array = new int[3][3] ;
       int[][]array1 = new int[3][3];
       int i,j;
        System.out.println("Enter the Elements of Array");
        Scanner sc = new Scanner(System.in);
        for( i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the Element of Second Array");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Print the Array Element");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println(array[i][j]+array1[i][j]);
            }
        }

    }
}

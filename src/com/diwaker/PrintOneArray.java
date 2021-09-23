package com.diwaker;
import java.util.Scanner;

public class PrintOneArray {
    public static void main(String[] args){
        int[][] array = new int[3][3];
        int[][] array1 = new int[3][3];
        int i,j;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Array Elements");
        for(i = 0; i < 3; i++)
        {
            for(j = 0 ; j < 3; j++)
            {
                array[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter the Second Array Element");
        for(i = 0; i < 3; i++)
        {
            for(j = 0 ; j < 3; j++)
            {
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Print THe Multiplication of Array");
        for(i = 0; i < 3; i++)
        {
            for(j = 0; j < 3; j++)
            {
                System.out.println(array[i][j] * array1[i][j]);
            }
        }
    }
}

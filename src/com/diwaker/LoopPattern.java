package com.diwaker;

public class LoopPattern {
    public static void main(String[] args){

        int i,j,row=10;
        for(i = 0; i<=row; i++)
        {

            for(j = 0 ; j<=i; j++)
            {
                System.out.println("*");
            }
            System.out.println();

        }
    }
}

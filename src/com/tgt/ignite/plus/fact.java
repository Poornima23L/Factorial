package com.tgt.ignite.plus;

import java.util.Scanner;

public class fact {
    public static void main(String[] args){
        int i,fact=1,n;
        Scanner read = new Scanner(System.in);
        System.out.println("enter a number");
        n = read.nextInt();
        for(i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factoirial of " +n+ " is " +fact);
    }
}


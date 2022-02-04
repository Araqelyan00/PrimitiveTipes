package com.company;

import java.util.Scanner;

/*
Given int number,input from console, find last digit and print it.
*/
public class Task8 {
    public static void main(String[] args) {
        System.out.print("Please enter a number: num = ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int lastDigit = number % 10;
        System.out.println("Last digit of number is equal to " + lastDigit);
    }
}

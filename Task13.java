package com.company;

import java.util.Scanner;

/*
Given an integer 3-digit number, determine and print the second digit. Input number from console.
*/
public class Task13 {
    public static void main(String[] args) {
        System.out.println("Please enter a 3-digit number: num = ");
        Scanner scanner = new Scanner(System.in);
        int threeDigitNumber = scanner.nextInt();
        int lastNumber = threeDigitNumber % 10;
        threeDigitNumber = threeDigitNumber - lastNumber;
        threeDigitNumber = threeDigitNumber / 10;
        int secondDigit = threeDigitNumber % 10;
        System.out.println("Second digit is equal to " + secondDigit);
    }
}

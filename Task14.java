package com.company;

import java.util.Scanner;

/*
 Given an integer  3-digit number, determine and print the sum of
 all 3 digits. Input number from console.

*/
public class Task14 {
    public static void main(String[] args) {
        System.out.print("Please enter a 3-digit number: num = ");
        Scanner scanner = new Scanner(System.in);
        int threeDigitNumber = scanner.nextInt();
        int lastDigit = threeDigitNumber % 10;
        threeDigitNumber = threeDigitNumber - lastDigit;
        threeDigitNumber = threeDigitNumber / 10;
        int secondDigit = threeDigitNumber % 10;
        int firstDigit = (threeDigitNumber - secondDigit) / 10;
        int sum = firstDigit + secondDigit + lastDigit;
        System.out.println("Sum of digits is equal to " + sum);
    }
}

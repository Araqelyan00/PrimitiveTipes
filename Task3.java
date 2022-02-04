package com.company;

import java.util.Scanner;
/*
 Write a Java program  that takes two numbers as input
 from the console and display the product of two numbers.
*/
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Please write 2 numbers");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int productOfTwoNumbers = firstNumber * secondNumber;
        System.out.println("Product of numbers is");
        System.out.println(productOfTwoNumbers);
    }
}

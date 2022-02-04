package com.company;

import java.util.Scanner;

/*
Given 2 integer numbers, swap them,Input numbers from console.
*/
public class Task15 {
    public static void main(String[] args) {
        System.out.print("Please enter 2 numbers: ");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        int swapper = firstNumber;
        firstNumber = secondNumber;
        secondNumber = swapper;
        System.out.println("Swapped: " + firstNumber + " " + secondNumber);
    }
}

package com.company;

import java.util.Scanner;

/*
Input from console 3 arguments and then prints the sum,the average;
*/
public class Task4 {
    public static void main(String[] args) {
        System.out.println("Please write 3 numbers");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int sumOfNumbers = firstNumber + secondNumber + thirdNumber;
        int averageOfNumbers = sumOfNumbers / 3;
        System.out.println("Sum of 3 numbers is");
        System.out.println(sumOfNumbers);
        System.out.println("Average of 3 numbers is");
        System.out.println(averageOfNumbers);
    }
}

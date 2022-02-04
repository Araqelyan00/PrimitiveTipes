package com.company;

import java.util.Scanner;
/*
 Find the sum of
- the first 4 consecutive odd numbers
- the first 4 consecutive even numbers

*/
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please write 4 consecutive odd or even numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int sum = a + b + c + d;
        System.out.println("Sum of numbers is");
        System.out.println(sum);
    }
}

package com.company;

import java.util.Scanner;

/*
Given arithmetic sequence Sn  = 3n*n - 12n
-print the sum S10
-print the sum S15

*/
public class Task7 {
    public static void main(String[] args) {
        System.out.print("Please enter a number: n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 3 * n * n - 12 * n;
        System.out.println("The sum of arithmetic sequence is equal to " + sum);
    }
}

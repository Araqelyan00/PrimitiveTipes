package com.company;

import java.util.Scanner;

/*
In program we have byte b, short c , int a,  variables, print result
of these actions
-  print average of them
-  print product of them

*/
public class Task6 {
    public static void main(String[] args) {
        System.out.println("Please enter 3 numbers," +
                " the first of which belongs to the range " +
                "of -128 to 127, the second to the range of " +
                "-32768 to 32767 and the third to the range of " +
                "-2147483648 to 2147483647.");
        Scanner scanner = new Scanner(System.in);
        byte b = scanner.nextByte();
        short c = scanner.nextShort();
        int a = scanner.nextInt();
        int averageOfNumbers = (a + b + c) / 3;
        int productOfNumbers = a * b * c;
        System.out.println("Average of numbers is equal to " + averageOfNumbers);
        System.out.println("Product of numbers in equal to " + productOfNumbers);
    }
}

package com.company;

import java.util.Scanner;

/*
Write java program which determines if the given int number is odd,
print result(use == operator, use boolean primitive type).

*/
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int isOdd = scanner.nextInt();
        System.out.println(isOdd % 2 != 0);
    }
}

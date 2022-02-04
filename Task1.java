package com.company;

import java.util.Scanner;

/*
 Write a Java program to convert minutes into a number of
 hours,print count of hours and minutes. Input minutes from
 console.
 */
public class Task1 {

    public static void main(String[] args) {
        System.out.println("Please write number of minutes");
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();
        int hours = minutes / 60;
        System.out.println("Hours");
        System.out.println(hours);
        minutes = minutes - hours * 60;
        System.out.println("Minutes");
        System.out.println(minutes);
    }
}

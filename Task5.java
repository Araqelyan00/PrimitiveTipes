package com.company;

import java.util.Scanner;

/*
Write a java program to calculate area of a
-right-angled triangle
-square
-rectangle
*/
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Please input 2 edges");
        Scanner scanner = new Scanner(System.in);
        int firstEdge = scanner.nextInt();
        int secondEdge = scanner.nextInt();
        int areaOfTriangle = firstEdge * secondEdge / 2;
        int areaOfSquare = firstEdge * firstEdge;
        int areaOfRectangle = firstEdge * secondEdge;
        System.out.println("Area of right-angled triangle is equal to " + areaOfTriangle);
        System.out.println("Area of square is equal to " + areaOfSquare);
        System.out.println("Area of rectangle is equal to " + areaOfRectangle);
    }
}

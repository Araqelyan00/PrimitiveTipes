package com.company;

import java.util.Random;

/*
Generate and print random integer number.
*/
public class Task9 {
    public static void main(String[] args) {
        Random random = new Random();
        int ranNumber = random.nextInt();
        System.out.println(ranNumber);
    }
}

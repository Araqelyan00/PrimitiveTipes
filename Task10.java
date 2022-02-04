package com.company;

import java.util.Random;

/*
Generate and print random integer number between 0 to 15(bound)
*/
public class Task10 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(16));
    }
}

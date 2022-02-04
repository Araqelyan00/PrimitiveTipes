package com.company;

import java.util.Random;

/*
Generate and print random integer number between 15 to 30
*/
public class Task11 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(16) + 15);
    }
}

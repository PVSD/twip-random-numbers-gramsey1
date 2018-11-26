package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            System.out.println(randomInt);
        }
    }
}

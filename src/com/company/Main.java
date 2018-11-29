package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int r = 0, count = 0;
        boolean[] array = new boolean[100];
        array[59]=true;
        int p = 0;
        Random rndm = new Random();
        for (int j = 0; j < array.length; j++) { //for loop to generate 100 random numbers
            r = 1 + rndm.nextInt(100);
            System.out.print(r + " ");
            count++; //used for the if statement
            if (count > 100) { //printing out all 100 numbers on one line
                System.out.println(" ");
            }
            for (int i = 0; i < array.length; i++) {
                
                if (array[i] == true){
                    break;
                }
            }
        }
    }
}
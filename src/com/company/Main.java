package com.company;

import java.util.*;
public class Main {

    public static void main(String[] args) {

        int count=0; int timesRunning=0;
        System.out.println("Enter the amount you want to run it: Only integers, and don't put a number too big");
        Scanner kbinput = new Scanner(System.in);
        int control = kbinput.nextInt();
        for (int i=0; i<=control; i++){
            timesRunning++;
            boolean array[]= new boolean[100];//duh, this does the below here.
            boolean yes;
            while(true){
                Random rndm = new Random();
                int x = rndm.nextInt(100);//limits what random number is 1-100
                array[x]=true;
                count++;
                yes=true;
                for(int k=0; k<100; k++){
                    if(array[k]==false)
                        yes=false;//this runs the loop again
                }
                if(yes==true){
                    break;
                }
            }
        }
        int avg = count/timesRunning;
        System.out.println(avg);
    }
}
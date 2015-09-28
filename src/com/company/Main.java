package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Testing the random number generator");
        Random rng = new Random(); // RNG = random number generator
        //int randomChoice = rng.nextInt(5);
        // This should pick an integer in the range 0 to (5 minus 1).
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        for (int i = 1; i <= 1000000; i++) {
            int randomChoice = rng.nextInt(5);

// This is a test program to get onto github
            switch (randomChoice) {
                case 0: {

                    if (randomChoice == 0){
                        zeros = zeros + 1;
                    }
                    break;
                }
                case 1: {

                    if (randomChoice == 1){
                        ones = ones + 1;
                    }
                    break;
                }
                case 2: {

                    if (randomChoice == 2) {
                        twos = twos + 1;
                    }
                    break;
                }
                case 3: {

                    if (randomChoice == 3) {
                        threes = threes + 1;
                    }
                    break;
                }
                case 4: {

                    if (randomChoice == 4) {
                        fours = fours + 1;
                    }

                    break;
                }
                default: {
                    //This happens if none of the other cases are true
                    System.out.println("RNG chose something else:" + randomChoice);
                }
            }

        }
        System.out.println("There were "+ zeros + " 0sss");
        System.out.println("There are "+ ones + " 2s");
        System.out.println("There were "+ twos + " 2s");
        System.out.println("There were "+ threes + " 3s");
        System.out.println("There were "+ fours + " 5s");
    }
}

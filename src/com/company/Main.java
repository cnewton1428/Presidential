package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // UnPresidential

        Scanner input = new Scanner(System.in);

        //Declare array to hold words
        String[] presidents = new String[10];

        for (int index = 0; index < presidents.length; index++) {
            System.out.println("Enter a president");

            //Get input from user
//            String wordInput = input.nextLine();
            presidents[index] = input.nextLine();
            //Store input from array
//            presidents[index] = wordInput;
        }

        //only print when user prompts for hx!
        System.out.println("Enter a word: ");
        String in = input.nextLine();

        if (in.equalsIgnoreCase("history")) {
            //print out presidents backwards
            for (int i = presidents.length - 1; i >= 0; i--) { //instead of 9;go backwards from highest to lowest
                System.out.println(presidents[i]); //print backwards to list most recent to past Prez
            }

        }
    }
}
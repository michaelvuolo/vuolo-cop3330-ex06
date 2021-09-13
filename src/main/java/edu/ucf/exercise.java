/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // prompt for first number
        System.out.print("What is the first number? ");

        // create new scanner
        Scanner input = new Scanner(System.in);

        // read first number
        int firstNumber = Integer.parseInt(input.nextLine());

        // prompt for second number
        System.out.print("What is the second number? ");

        // read second number
        int secondNumber = Integer.parseInt(input.nextLine());

        // calculate simple math
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int multiplied = firstNumber * secondNumber;
        int divided = firstNumber / secondNumber;

        // output results
        System.out.print(firstNumber + " + " + secondNumber +" = " + sum + "\n" + firstNumber + " - " + secondNumber + " = " + difference + "\n" + firstNumber + " * " + secondNumber + " = " + multiplied + "\n" + firstNumber + " / " + secondNumber + " = " + divided);
    }
}

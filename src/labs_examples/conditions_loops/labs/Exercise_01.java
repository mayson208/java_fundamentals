package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 1: Even or Odd
 *
 *      Write a program that gets a number between 1 and 1,000,000
 *      from the user and determines whether it is odd
 *      or even using an if statement. Print the result.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 */

public class Exercise_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 1,000,000 to determine whether it is odd or even: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 1_000_000) {
            System.out.println("Number is out of range. Please enter a number between 1 and 1,000,000.");
        } else {
            if (number % 2 == 0) {
                System.out.println("The number " + number + " is even.");
            } else {
                System.out.println("The number " + number + " is odd.");
            }
        }
    }
}

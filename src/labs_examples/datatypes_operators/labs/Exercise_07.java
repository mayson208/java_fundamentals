package labs_examples.datatypes_operators.labs;

import java.util.Scanner;

/**
 * Fundamentals Exercise 5: Days to seconds
 *
 *      Take in a number in days from the user between 1 and 1,000,000 and convert it to
 *      seconds.
 *
 *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {

        // create scanner
        // prompt user
        // assign input to variable as int
        // write completed code here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number in days between 1 and 1,000,000: ");
        int days = scanner.nextInt();

        if (days < 1 || days > 1_000_000) {
            System.out.println("Invalid input. Please enter a number between 1 and 1,000,000.");
        } else {
            long seconds = (long) days * 24 * 60 * 60;
            System.out.println(days + " days is equal to " + seconds + " seconds.");
        }

        scanner.close();
    }
}
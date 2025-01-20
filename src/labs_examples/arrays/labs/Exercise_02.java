package labs_examples.arrays.labs;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10:");


        int userInput = 0;
        if (scanner.hasNextInt()) {
            userInput = scanner.nextInt();
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 10.");
            return;
        }

        if (userInput < 1 || userInput > 10) {
            System.out.println("Number out of range. Please enter a number between 1 and 10.");
            return;
        }

        int index = -1; //
        for (int i = 0; i < array.length; i++) {
            if (array[i] == userInput) {
                index = i;
                break;
            }
        }


        if (index != -1) {
            System.out.println("The number " + userInput + " is at index " + index + " in the array.");
        } else {
            System.out.println("The number " + userInput + " is not in the array.");
        }

        scanner.close();
    }
}
package labs_examples.conditions_loops.labs;

import java.util.Scanner;
/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write completed here
System.out.print("Enter a number (1-7) to get the day of the week assigned to said number");
int dayNumber = scanner.nextInt();
            if (dayNumber == 1) {
                System.out.println("Monday");
            } else if (dayNumber == 2) {
                System.out.println("Tuesday");
            } else if (dayNumber == 3) {
                System.out.println("Wednesday");
            } else if (dayNumber == 4) {
                System.out.println("Thursday");
            } else if (dayNumber == 5) {
                System.out.println("Friday");
            } else if (dayNumber == 6) {
                System.out.println("Saturday");
            } else if (dayNumber == 7) {
                System.out.println("Sunday");
            } else {
                System.out.println("Other");
        }
            scanner.close();
    }
}

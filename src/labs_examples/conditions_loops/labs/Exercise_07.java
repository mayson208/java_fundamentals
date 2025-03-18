package labs_examples.conditions_loops.labs;
import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().toLowerCase();
        String vowels = "aeiou";

        int index = 0;
        char firstVowel = '\0';
        while (index < word.length()) {
            char currentChar = word.charAt(index);
            if (vowels.indexOf(currentChar) != -1) {
                firstVowel = currentChar;
                break;
            }
            index++;
        }

        if (firstVowel != '\0') {
            System.out.println("Word: " + word);
            System.out.println("First vowel: " + firstVowel);
        } else {
            System.out.println("No vowels found in the word.");
        }

        scanner.close();
    }
}


package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int length = str.length();

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean isEqual = str.equals(str2);

        // please concatenate str & str2 and set the result to a new String variable below
        String concatenated = str + str2;

        // please demonstrate the use of any other method that is available to us in the String class
        String replacedStr = str.replace("!", "?"); // Replaces '!' with '?'
        boolean containsHello = str.contains("hello"); // Checks if str contains "hello"
        int indexOfExclamation = str.indexOf("!"); // Finds index of '!'
        String upperCaseStr = str.toUpperCase(); // Converts str to uppercase

        // for example, replace(), substring(), contains(), indexOf() etc
        System.out.println("Length of str: " + length);
        System.out.println("Are str and str2 equal? " + isEqual);
        System.out.println("Concatenated string: " + concatenated);
        System.out.println("Replaced string: " + replacedStr);
        System.out.println("Does str contain 'hello'? " + containsHello);
        System.out.println("Index of '!': " + indexOfExclamation);
        System.out.println("Uppercase version of str: " + upperCaseStr);

    }


}
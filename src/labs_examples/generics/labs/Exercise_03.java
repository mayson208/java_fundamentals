package labs_examples.generics.labs;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;


/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

public class Exercise_03 {

    // 1. Sum two Numbers
    public static <T extends Number, U extends Number> double sum(T num1, U num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    // 2. Count palindromes in a collection of Strings
    public static <T extends Collection<String>> int countPalindromes(T collection) {
        int count = 0;
        for (String str : collection) {
            String reversed = new StringBuilder(str).reverse().toString();
            if (str.equalsIgnoreCase(reversed)) {
                count++;
            }
        }
        return count;
    }

    // 3. Swap elements in an array
    public static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // 4. Find the largest element in a sublist
    public static <T extends Comparable<T>> T findLargest(List<T> list, int begin, int end) {
        List<T> subList = list.subList(begin, end);
        return Collections.max(subList);
    }

    // Optional: Test the methods in main
    public static void main(String[] args) {
        // Test #1
        System.out.println("Sum: " + sum(5, 7.5)); // Should print 12.5

        // Test #2
        List<String> words = Arrays.asList("radar", "hello", "level", "world", "civic");
        System.out.println("Palindromes: " + countPalindromes(words)); // Should print 3

        // Test #3
        Integer[] nums = {1, 2, 3, 4};
        swapElements(nums, 1, 3);
        System.out.println("Swapped array: " + Arrays.toString(nums)); // Should be [1, 4, 3, 2]

        // Test #4
        List<Integer> numbers = Arrays.asList(3, 5, 1, 9, 2);
        System.out.println("Largest in range: " + findLargest(numbers, 1, 4)); // Should print 9
    }
}
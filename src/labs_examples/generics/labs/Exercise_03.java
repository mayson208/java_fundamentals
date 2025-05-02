package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Collection;

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

    // 1.
public static <T extends Number, U extends Number> double sum(T num1, U num2) {
    return num1.doubleValue() + num2.doubleValue();

    // 2.
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
    // 3.
    public static <T> void swapElements(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    // 4.
    public static <T extends Comparable<T>> T findLargest(List<T> list, int begin, int end) {
        List<T> subList = list.subList(begin, end);
        return Collections.max(subList);
    }
}
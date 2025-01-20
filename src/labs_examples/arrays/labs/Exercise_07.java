package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Elderberry");

        System.out.println("First fruit: " + fruits.get(0)); // Access the first element
        System.out.println("Third fruit: " + fruits.get(2)); // Access the third element

        System.out.println("\nInitial list of fruits: " + fruits);

        System.out.println("Does the list contain 'Banana'? " + fruits.contains("Banana"));

        fruits.remove("Date");
        System.out.println("After removing 'Date': " + fruits);

        System.out.println("Size of the ArrayList: " + fruits.size());

        fruits.set(1, "Blueberry"); // Replace "Banana" with "Blueberry"
        System.out.println("After replacing 'Banana' with 'Blueberry': " + fruits);


        fruits.clear();
        System.out.println("After clearing the list: " + fruits);
    }
}
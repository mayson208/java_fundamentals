package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

public class Exercise_01<T, U> {
    private T first;
    private U second;

    public Exercise_01(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Exercise_01<String, Integer> obj1 = new Exercise_01<>("Hello", 123);
        Exercise_01<Integer, Double> obj2 = new Exercise_01<>(456, 78.9);
    }
}
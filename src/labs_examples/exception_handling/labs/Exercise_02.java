package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */


public class Exercise_02 {
    public static void main(String[] args) {
        try {
            int[] numbers = new int[2];
            numbers[5] = 10;

            String text = null;
            System.out.println(text.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to access a null object.");
        } catch (Exception e) {
            System.out.println("An unknown error occurred.");
        }
    }
}


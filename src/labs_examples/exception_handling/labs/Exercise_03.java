package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
public class Exercise_03 {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
        } catch (ArithmeticException e) {
        } finally {
            System.out.println("This will always execute.");
        }
    }
}
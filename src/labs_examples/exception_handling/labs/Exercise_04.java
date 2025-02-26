package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
public class Exercise_04 {
    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0; // Inner try
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero.");
            }
        } catch (Exception e) {
            System.out.println("Outer catch: An error occurred.");
        }
    }
}
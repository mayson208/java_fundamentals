package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {
        try {
            methodThatThrowsException();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void methodThatThrowsException() throws Exception {
        throw new Exception("Exception thrown from method.");
    }
}








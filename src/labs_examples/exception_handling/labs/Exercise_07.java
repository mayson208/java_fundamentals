package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class Exercise_07 {

    public static void main(String[] args) {
        try {
            throwCustomException();
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void throwCustomException() throws MyCustomException {
        throw new MyCustomException("Custom exception thrown.");
    }
}
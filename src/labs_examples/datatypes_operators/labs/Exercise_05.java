package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        if (a | b) {
            System.out.println("a OR b is true");
        }

        if (a || b) {
            System.out.println("a short-circuit OR b is true");
        }

        if (a & b) {
            System.out.println("a AND b is true");
        } else {
            System.out.println("a AND b is false");
        }

        if (a && b) {
            System.out.println("a short-circuit AND b is true");
        } else {
            System.out.println("a short-circuit AND b is false");
        }

        if (a ^ b) {
            System.out.println("a XOR b is true");
        }

        System.out.println("NOT a: " + (!a));
        System.out.println("NOT b: " + (!b));
    }
}

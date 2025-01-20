package testing;

public class MathController {

    public static void main(String[] args) {
        double a = 12;
        double b = 14;

        System.out.println("before a:" + a);
        System.out.println("before a:" + b);

        someOtherMethod(a, b);

        System.out.println("before a:" + a);
        System.out.println("before a:" + b);
    }
    public static void someOtherMethod(double a,double b){
        a = a * 10;
        System.out.println(a);
        b = b * 20;
        System.out.println(b);
    }

}



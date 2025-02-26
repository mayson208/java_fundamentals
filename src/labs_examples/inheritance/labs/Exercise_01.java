package labs_examples.inheritance.labs;

/**
 * Inheritance Exercise 1:
 *
 *      1) Create one super class Class1 and two subclasses Class2 and Class3.
 *          -Class2 should extend Class1.
 *          -Class3 should extend Class2.
 *      2) Each class should have at least two instance variable, all private.
 *      3) Create getters and setters for all instance variables and demonstrate setting superclass
 *          variables from a subclass
 *      4) Demonstrate the use of (non getter and setter) methods in a superclass from a subclass.
 *      5) Add constructors to each class and demonstrate the use of a superclass constructor
 *          from a subclass.
 *      6) Demonstrate constructor overloading and the use of the "super" keyword.
 *      7) Demonstrate method overloading.
 *
 *      NOTE: We encourage you to be creative and try to think of an example of your own for this
 *       exercise but if you are stuck, some ideas include:
 *
 *       - A Vehicle superclass, with Truck and Motorcycle subclasses.
 *       - A Restaurant superclass, with Gourmet and FastFood subclasses.
 *
 *
 */

class Class1 {
    private String name;
    private int age;

    public Class1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Class2 extends Class1 {
    private String job;

    public Class2(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public String getJob() {
        return job;
    }
}

class Class3 extends Class2 {
    private String hobby;

    public Class3(String name, int age, String job, String hobby) {
        super(name, age, job);
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }
}

public class Exercise_01 {
    public static void main(String[] args) {
        Class3 obj = new Class3("Alice", 30, "Developer", "Photography");
    }
}

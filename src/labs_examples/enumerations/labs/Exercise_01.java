package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 * 1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 * 2) Create a parameterized enumeration that passes one or more values to its constructor. Demonstrate the use
 *    of this enum from a separate class.
 */

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum Fruit {
    APPLE("Red", 95),
    BANANA("Yellow", 105),
    ORANGE("Orange", 62),
    GRAPE("Purple", 3);

    private final String color;
    private final int calories;

    Fruit(String color, int calories) {
        this.color = color;
        this.calories = calories;
    }

    public String getColor() {
        return color;
    }

    public int getCalories() {
        return calories;
    }
}

public class Exercise_01 {  // Fixed class name
    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        System.out.println("Today is: " + today);
        System.out.println();

        Fruit favoriteFruit = Fruit.BANANA;
        System.out.println("Favorite Fruit: " + favoriteFruit);
        System.out.println("Color: " + favoriteFruit.getColor());
        System.out.println("Calories: " + favoriteFruit.getCalories());
    }
}

package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {
    public static void main(String[] args) {
            double radius = 3.14;
            double height = 5;

            double volume = Math.PI * Math.pow(radius, 2) * height;
            double surfaceArea = 2 * Math.PI * radius * (radius + height);

            System.out.println("Volume of the cylinder: " + volume);
            System.out.println("Surface area of the cylinder: " + surfaceArea);
        }
    }








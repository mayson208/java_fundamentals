package labs_examples.input_output.labs;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */
import java.io.*;
import java.util.*;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + city;
    }

    public static Person fromCSV(String line) {
        String[] data = line.split(",");
        return new Person(data[0], Integer.parseInt(data[1]), data[2]);
    }
}

public class Exercise_04 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        // Read the CSV file
        try (BufferedReader br = new BufferedReader(new FileReader("input.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                people.add(Person.fromCSV(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the objects
        for (Person person : people) {
            System.out.println(person);
        }

        // Write the arraylist back to a new CSV file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.csv"))) {
            for (Person person : people) {
                bw.write(person.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

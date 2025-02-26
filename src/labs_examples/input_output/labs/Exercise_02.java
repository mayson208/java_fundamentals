package labs_examples.input_output.labs;
import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */
public class Exercise_02 {
    public static void main(String[] args) {
        try (BufferedReader inputFile = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter outputFile = new BufferedWriter(new FileWriter("output.txt"))) {

            int charRead;
            while ((charRead = inputFile.read()) != -1) {
                char currentChar = (char) charRead;
                if (currentChar == 'a') {
                    outputFile.write('-');
                } else if (currentChar == 'e') {
                    outputFile.write('~');
                } else {
                    outputFile.write(currentChar);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader encryptedFile = new BufferedReader(new FileReader("output.txt"))) {
            int charRead;
            while ((charRead = encryptedFile.read()) != -1) {
                System.out.print((char) charRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

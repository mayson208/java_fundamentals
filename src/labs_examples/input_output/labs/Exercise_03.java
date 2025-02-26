package labs_examples.input_output.labs;
import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {
        // Byte Stream Example
        try (FileOutputStream byteOut = new FileOutputStream("byteOutput.txt");
             BufferedOutputStream bufferedByteOut = new BufferedOutputStream(byteOut)) {
            String data = "This is a byte stream example.";
            bufferedByteOut.write(data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Character Stream Example
        try (FileWriter charOut = new FileWriter("charOutput.txt");
             BufferedWriter bufferedCharOut = new BufferedWriter(charOut)) {
            String data = "This is a character stream example.";
            bufferedCharOut.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // DataInputStream and DataOutputStream Example
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("dataOutput.dat"));
             DataInputStream dataIn = new DataInputStream(new FileInputStream("dataOutput.dat"))) {
            dataOut.writeInt(123);
            dataOut.writeDouble(456.78);

            // Reading from DataInputStream
            System.out.println("Integer: " + dataIn.readInt());
            System.out.println("Double: " + dataIn.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


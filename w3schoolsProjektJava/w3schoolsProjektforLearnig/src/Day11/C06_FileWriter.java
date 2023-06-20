package Day11;

import java.io.FileWriter;
import java.io.IOException;
public class C06_FileWriter {

    public static void main(String[] args) {

        try{
            FileWriter myWriter = new FileWriter("file1.txt");
            myWriter.write("Files in java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Writing is done successfully");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

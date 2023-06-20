package Day11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class C07_ReadFiles {

    public static void main(String[] args) {

        try{
            File myObj = new File ("file1.txt");
            Scanner scan = new Scanner(myObj);
            while (scan.hasNextLine()) {
                String data = scan.nextLine();
                System.out.println(data);
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        File myObj = new File ("file1.txt");
        if (myObj.exists()) {
            System.out.println("File name : " + myObj.getName());
            System.out.println("Absolute path : " + myObj.getAbsolutePath());
            System.out.println("Writeable : " + myObj.canWrite());
            System.out.println("Readable : " + myObj.canRead());
            System.out.println("File size in bytes : " + myObj.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }

}

package Day11;

import java.io.File;        // import the File Class
import java.io.IOException;

public class C05_Files {

    public static void main(String[] args) {

        try {
            File myObj = new File("file1.txt");     // Specify the filename
            if (myObj.createNewFile()){
                System.out.println("File created : " + myObj.getName());
            } else {
                System.out.println("File already exists. ");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            File myObj2 = new File("file2.txt");
            if (myObj2.createNewFile()) {
                System.out.println("File crated : " + myObj2.getName());
                System.out.println("Absolute path : " + myObj2.getAbsolutePath());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        try {
            File myObj3 = new File("C:\\Users\\IT_Admin\\Desktop\\javaProjekteForBeginers\\w3schoolsProjektJava\\w3schoolsProjektforLearnig\\file3.txt");
            if (myObj3.createNewFile()) {
                System.out.println("File crated : " + myObj3.getName());
                System.out.println("Absolute path : " + myObj3.getAbsolutePath());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}

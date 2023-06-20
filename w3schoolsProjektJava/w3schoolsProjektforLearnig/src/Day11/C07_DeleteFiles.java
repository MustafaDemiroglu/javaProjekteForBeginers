package Day11;

import java.io.File;
public class C07_DeleteFiles {

    public static void main(String[] args) {

        File myObj = new File("file2.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file : " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file. ");
        }

        File myObj2 = new File("C:\\Users\\IT_Admin\\Desktop\\javaProjekteForBeginers\\w3schoolsProjektJava\\w3schoolsProjektforLearnig\\Test");
        if (myObj2.delete()) {
            System.out.println("Deleted the folder: " + myObj2.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}

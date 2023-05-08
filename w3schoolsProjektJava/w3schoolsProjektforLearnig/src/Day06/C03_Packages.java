package Day06;

import java.util.Scanner;

public class C03_Packages {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in) ;
        String userName ;

        // enter username
        System.out.println("Enter Username");
        userName= myObj.nextLine();

        System.out.println("Username is : " + userName);

        myObj.close();
    }
}

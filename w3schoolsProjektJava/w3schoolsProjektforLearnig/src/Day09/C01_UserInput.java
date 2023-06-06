package Day09;

import java.util.Scanner;

public class C01_UserInput {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in) ;

        System.out.println(" Enter your name, age and salary, step by step please");

        // String input
        System.out.println("Name : ");
        String name = scan.nextLine() ;

        // Numerical input
        System.out.println("Age : ");
        int age = scan.nextInt() ;
        System.out.println("Salary : ");
        double salary = scan.nextDouble();

        // output input by user

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);

    }
}

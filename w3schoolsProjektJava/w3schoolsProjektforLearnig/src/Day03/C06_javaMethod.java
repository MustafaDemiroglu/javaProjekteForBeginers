package Day03;

public class C06_javaMethod {
    static void myMethod() {
        System.out.println ("I have just got executed");
    }

    static void myMethod2(String fname) {
        System.out.println( fname + " Surname");
    }

    static void myMethod3 (String fname, int age){
        System.out.println(fname + " Surname"+ " is " + age + " years old.");
    }

    static int mymethod4(int x) {
        return 5+x ;
    }

    static int myMethod5( int a , int b) {
        return a+b;
    }

    // Create a checkAge() method with an integer parameter called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
        myMethod();
        System.out.println("");
        myMethod2("Mike");
        myMethod2("Adam");

        System.out.println("");
        myMethod3("Mike",12);
        myMethod3("Adam",26);

        System.out.println("");
        System.out.println(mymethod4(7));

        System.out.println("");
        System.out.println(myMethod5(8,9));

        System.out.println("");
        int z = myMethod5(3,5);
        System.out.println(z);

        System.out.println("");
        checkAge(20); // Call the checkAge method and pass along an age of 20
    }
}

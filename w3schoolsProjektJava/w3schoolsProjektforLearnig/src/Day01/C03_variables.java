package Day01;

public class C03_variables {
    /* Java Variables
    Variables are containers for storing data values.
    In Java, there are different types of variables, for example:
    String - stores text, such as "Hello". String values are surrounded by double quotes
    int - stores integers (whole numbers), without decimals, such as 123 or -123
    float - stores floating point numbers, with decimals, such as 19.99 or -19.99
    char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
    boolean - stores values with two states: true or false
    */

    public static void main(String[] args) {
        String name = "John";
        System.out.println (name) ;

        int myNum = 15 ;
        System.out.println (myNum) ;

        int myNum2 = 15;
        myNum2 = 20;  // myNum2 is now 20
        System.out.println(myNum2);

        float myFloatnum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true ;

        System.out.println(myFloatnum);
        System.out.println(myLetter);
        System.out.println(myBool);

    }
}

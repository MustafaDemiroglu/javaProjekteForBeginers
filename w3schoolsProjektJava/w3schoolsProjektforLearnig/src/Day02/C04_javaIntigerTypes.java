package Day02;

public class C04_javaIntigerTypes {
    public static void main ( String [ ] args ) {
        // The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory when you are certain that the value will be within -128 and 127:
        byte myByte = 10 ;
        // The short data type can store whole numbers from -32768 to 32767:
        short myShort = 5000 ;
        // The int data type can store whole numbers from -2147483648 to 2147483647. In general, and in our tutorial, the int data type is the preferred data type when we create variables with a numeric value.
        int myInt = 100000 ;
        // The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807. This is used when int is not large enough to store the value. Note that you should end the value with an "L":
        long mylong = 15000000000L ;
        // The float and double data types can store fractional numbers. Note that you should end the value with an "f" for floats and "d" for doubles:
        float myFloat = 5.75f ;
        double myDouble = 19.99d ;

        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(mylong);
        System.out.println(myFloat);
        System.out.println(myDouble);

        //A floating point number can also be a scientific number with an "e" to indicate the power of 10
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

    }
}

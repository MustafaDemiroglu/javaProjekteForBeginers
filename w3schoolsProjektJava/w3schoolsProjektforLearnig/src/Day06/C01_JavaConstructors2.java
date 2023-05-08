package Day06;


public class C01_JavaConstructors2 {   // create main class
    int x;    // create a class attribute

    public C01_JavaConstructors2(int y) {
        x = y ;     // ste the initial value for the class attribute
    }

    public static void main(String[] args) {
        C01_JavaConstructors2 myObj = new C01_JavaConstructors2 (5);   // create an object
        System.out.println(myObj.x);
    }
}

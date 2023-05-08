package Day06;


public class C01_JavaConstructors {   // create main class
    int x;    // create a class attribute

    public C01_JavaConstructors() {
        x = 5 ;     // ste the initial value for the class attribute
    }

    public static void main(String[] args) {
        C01_JavaConstructors myObj = new C01_JavaConstructors ();   // create an object
        System.out.println(myObj.x);
    }
}

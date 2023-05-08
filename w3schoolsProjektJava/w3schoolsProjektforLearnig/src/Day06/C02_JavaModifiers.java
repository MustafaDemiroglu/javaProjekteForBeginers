package Day06;

public class C02_JavaModifiers {

    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod () {
        System.out.println("Public methods must be called by creating objects");
    }

    // main method
    public static void main(String[] args) {
        myStaticMethod();   // call the static method

        C02_JavaModifiers myObj = new C02_JavaModifiers();
        myObj.myPublicMethod();
    }
}

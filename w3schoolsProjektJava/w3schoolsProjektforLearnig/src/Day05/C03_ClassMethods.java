package Day05;

public class C03_ClassMethods {

    static void myMethod(){
        System.out.println("Hello. this is my first method");
    }

    // Static Method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    //Public Method
    public void myPublicMethod(){
        System.out.println("Public Methods must be called y creating objects");
    }

    // main Method
    public static void main(String[] args) {

        myMethod();
        myStaticMethod();
        C03_ClassMethods myObj = new C03_ClassMethods();
        myObj.myPublicMethod();
        myObj.myStaticMethod();
    }
}

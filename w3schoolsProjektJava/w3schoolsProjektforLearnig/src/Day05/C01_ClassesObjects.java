package Day05;

public class C01_ClassesObjects {

    int x = 5;
    double y = 48.78;

    public static void main(String[] args) {
        C01_ClassesObjects myObj = new C01_ClassesObjects();      // Object 1
        C01_ClassesObjects myObj2 = new C01_ClassesObjects();     // Object 2
        C01_ClassesObjects myObj3 = new C01_ClassesObjects();     // Object 3

        System.out.println(myObj.x);
        System.out.println(myObj2.x);
        System.out.println(myObj3.y);

        myObj.x = 35;
        myObj2.x = 55;
        myObj3.y = 70;

        System.out.println(myObj.x);
        System.out.println(myObj2.x);
        System.out.println(myObj3.y);

    }
}

package Day05;

public class C02_ClassAttributes {

    String fname = "John" ;
    String lname = "Doe" ;
    int age = 24 ;

    public static void main(String[] args) {
        C02_ClassAttributes myObj = new C02_ClassAttributes();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);

    }
}

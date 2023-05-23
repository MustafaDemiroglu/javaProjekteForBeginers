package Day07;

public class C02_JavaInheritance2 extends C01_JavaInheritance {

    private String modelName = "Mustang" ;      // Car attribute

    public static void main (String [] args) {

        // Create a myCar object
        C02_JavaInheritance2 myCar = new C02_JavaInheritance2() ;

        // Call the honk() method (from the Vehicle Class) on the myCar Object
        myCar.honk();

        // Display the value of the brand attribute (from the Vehicle class) and
        // the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);

    }
}

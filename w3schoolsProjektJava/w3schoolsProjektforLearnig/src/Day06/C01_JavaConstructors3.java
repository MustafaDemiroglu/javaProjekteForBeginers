package Day06;

public class C01_JavaConstructors3 {

    int modelYear ;
    String modelName ;

    public C01_JavaConstructors3( int year, String name) {
        modelYear = year ;
        modelName = name ;
    }

    public static void main(String[] args) {
        C01_JavaConstructors3 myCar = new C01_JavaConstructors3(1969,"Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}

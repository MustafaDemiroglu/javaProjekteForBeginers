package Day09;

import java.util.ArrayList;

public class C03_ArrayList {

    public static void main(String[] args) {

        ArrayList<String> autos = new ArrayList<String>();
        autos.add("Mercedes");
        autos.add("Audi");
        autos.add("Volvo");
        System.out.println(autos);
        System.out.println("----------------");

        autos.add("BMW");
        autos.add("Ford");
        System.out.println(autos);
        System.out.println("-------------------");

        autos.add("Mazda");
        System.out.println(autos);
        System.out.println("--------------");

        autos.remove("Audi");
        autos.remove("Ford");
        autos.remove("Mazda");
        System.out.println(autos);
        System.out.println("-----------------");
    }
}

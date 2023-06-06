package Day09;

import java.util.LinkedList;

public class C04_LinkedList {

    public static void main(String[] args) {

        LinkedList<String> autos = new LinkedList<String>();
        autos.add("Mazda");
        autos.add("BMW");
        autos.add("Tesla");
        System.out.println(autos);
        System.out.println("--------------");

        autos.addFirst("Mercedes");
        autos.addLast("Audi");
        System.out.println(autos);
        System.out.println("--------------");

        autos.removeFirst();
        autos.removeLast();
        autos.remove("BMW");
        System.out.println(autos);
        System.out.println("--------------");
    }
}

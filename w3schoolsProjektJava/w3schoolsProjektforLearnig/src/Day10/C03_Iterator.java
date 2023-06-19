package Day10;

import java.util.ArrayList;
import java.util.Iterator;
public class C03_Iterator {

    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> autos = new ArrayList<String>();
        autos.add("Volvo");
        autos.add("Mercedes");
        autos.add("Hyundai");
        autos.add("BMW");

        // Get the Iterator
        Iterator<String> it = autos.iterator();

        // Print the first item
        System.out.println(it.next());

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        ArrayList<Integer> nummer = new ArrayList<Integer>();
        nummer.add(1);
        nummer.add(25);
        nummer.add(33);
        nummer.add(4);
        nummer.add(51);
        Iterator<Integer> it1 = nummer.iterator();
        while (it1.hasNext()) {
            Integer i = it1.next();

            if (i<10) {
                it1.remove();
            }
        }
        System.out.println(nummer);


    }
}

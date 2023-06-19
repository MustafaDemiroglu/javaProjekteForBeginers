package Day10;

import java.util.HashSet;
public class C02_HashSet {

    public static void main(String[] args) {

        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println("If Set has Mazda "+ cars.contains("Mazda"));
        System.out.println("If Set has Honda "+cars.contains("Honda"));

        cars.remove("Audi");
        System.out.println(cars);

        cars.clear();
        System.out.println(cars);

        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Mazda");
        System.out.println(cars.size());

        // Create a HashSet object called numbers
        HashSet<Integer> numbers = new HashSet<Integer>();

        // Add values to the set
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);

        // Show which numbers between 1 and 10 are in the set
        for(int i = 1; i <= 10; i++) {
            if(numbers.contains(i)) {
                System.out.println(i + " was found in the set.");
            } else {
                System.out.println(i + " was not found in the set.");
            }
        }


    }

}

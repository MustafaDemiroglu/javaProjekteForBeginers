package Day11;

import java.util.ArrayList;
import java.util.function.Consumer;

public class C03_Lambda {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((n)->{
            System.out.println(n);
        });

        System.out.println("---------------------------");

        ArrayList<Integer> numbers1 = new ArrayList<Integer>();
        numbers1.add(55);
        numbers1.add(99);
        numbers1.add(88);
        numbers1.add(11);
        Consumer<Integer> method = (n)->{
            System.out.println(n);};
        numbers1.forEach(method);
    }
}

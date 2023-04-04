package Day01;

public class C02_outputTypes {
    public static void main (String [] args) {
        System.out.println ("Hello world!");
        System.out.println ("I am learning Java");
        System.out.println ("It is awesome");

        //You can also use the println() method to print numbers.
        //However, unlike text, we don't put numbers inside double quotes:
        System.out.println (3);
        System.out.println (358);
        System.out.println (50000);
        //You can also perform mathematical calculations inside the println() method:
        System.out.println (300+738);
        System.out.println ((300*4)-(800/7));

        // There is also a print() method, which is similar to println().
        // The only difference is that it does not insert a new line at the end of the output:
        System.out.print ("Hello world!I am here again ");
        System.out.print (" i will print on the same line");
        System.out.print (" it doesn't matter how many times you try it :-) !!!");


    }
}

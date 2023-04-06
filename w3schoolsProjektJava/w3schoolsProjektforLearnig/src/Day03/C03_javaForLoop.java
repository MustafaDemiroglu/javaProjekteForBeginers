package Day03;

public class C03_javaForLoop {
    public static void main (String [] args) {
        for (int i=0; i<7 ; i=i+2){
            System.out.println ("here is your loop: " + i) ;
        }

        for (int i2=0; i2<5 ; i2++){
            System.out.println ("here is your 2. loop: " + i2) ;
        }

        for (int i3=0; i3<15 ; i3=i3+3){
            System.out.println ("here is your 3. loop: " + i3) ;
        }

        // Outer loop.
        for (int i4 = 1 ; i4 <= 2 ; i4++ ) {
            System.out.println ( "Outer: " + i4 ); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }

        String [] cars = { "volvo" , "BMW" , "Ford" , "Mercedes" , "Audi" , "Volkswagen" , "Mazda"};
        for ( String i5 : cars ) {
            System.out.println ( "for each Loop : " + i5);
        }
    }
}

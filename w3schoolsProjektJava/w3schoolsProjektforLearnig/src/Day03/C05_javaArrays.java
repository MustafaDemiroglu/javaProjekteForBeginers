package Day03;

public class C05_javaArrays {
    public static void main (String [] args) {
        String[] cars = { "Mercedes" , "BMW" , "VW" , "Toyota"};
        System.out.println (cars[0]);
        cars[0] = "Mazda";
        System.out.println (cars[0]);
        cars[3] = "Audi";
        System.out.println (cars[3]);
        System.out.println (cars.length);
        cars[0] = "Sang yong";
        cars[0] = "Lamborghini";
        cars[0] = "Jaguar";
        cars[0] = "Mini";
        System.out.println (cars.length);

        System.out.println ("");
        String [] cars2 = { "Mazda", "Audi", "Mercedes" , "BMW" , "VW" , "Toyota" , "Sang yong", "Lamborghini", "Jaguar", "Mini" };
        for (int i=0; i < cars2.length ; i++ ) {
            System.out.println (cars2[i]);
        }

        System.out.println ("");
        for (String i2: cars2) {
            System.out.println( "other way, even easier : " + i2);
        }

        System.out.println ("");
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]);

        System.out.println ("");
        int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers2[1][2] = 9;
        System.out.println(myNumbers2[1][2]); // Outputs 9 instead of 7

        System.out.println ("");
        int[][] myNumbers3 = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i3 = 0; i3 < myNumbers3.length; ++i3) {
            for(int j = 0; j < myNumbers3[i3].length; ++j) {
                System.out.println(myNumbers[i3][j]);
            }
        }
    }
}

package Day02;

public class C06_javaMath {
    public static void main ( String [ ] args ) {
        System.out.println("min of 5 and 10 is =" + Math.min(5,10));
        System.out.println("max of 5 and 10 is =" + Math.max(5,10));
        System.out.println("square of 25 is = " + Math.sqrt (25));
        System.out.println("absolute (positive) value of x:" + Math.abs(-4.7));
        System.out.println("Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):" + Math.random());
        int randomNum = (int)(Math.random() * 101);  // 0 to 100
        System.out.println(randomNum);

    }
}

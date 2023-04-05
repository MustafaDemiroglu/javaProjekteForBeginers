package Day02;

public class C08_javaIfElse {
    public static void main ( String [ ] args ) {
        if (20>18) {
            System.out.println("20 is greater than 18");
        }

        int x = 40 ;
        int y = 30 ;
        if ( x > y ) {
            System.out.println("x is greater than y");
        }

        int time = 21 ;
        if ( time < 19 ) {
            System.out.println("Have a nice day.");
        } else {
            System.out.println(" it is too late. see you another time");
        }

        int num = 75 ;
        if ( num < 18 ) {
            System.out.println(" Sorry but you are too young, so can not visit this Website ");
        } else if (num < 75 ) {
            System.out.println("Welcome to our Website and enjoy yourself");
        } else {
            System.out.println(" woow you re too old. it is better wenn you go to bed :-)");
        }

        int time3 = 20;
        String result;
        result = (time3 < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}

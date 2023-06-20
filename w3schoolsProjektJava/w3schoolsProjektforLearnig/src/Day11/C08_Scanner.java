package Day11;

import java.util.Scanner ;
public class C08_Scanner {

    public static void main(String[] args) {

        int x,y,sum;
        Scanner scan = new Scanner (System.in);

        System.out.println("Type a number : ");
        x = scan.nextInt();

        System.out.println("Type another number : ");
        y = scan.nextInt();

        sum = x+y;
        System.out.println("Sum is : " + sum);
    }
}

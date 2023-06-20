package Day11;

public class C01_Exceptions {

    static void checkAge (int age) {
        if (age<18){
            throw new ArithmeticException("Access denied. You are not allowed see this page.");
        } else {
            System.out.println("Access granted - Have fun!!! ");
        }
    }

    public static void main(String[] args) {

        try{
            int[] myNumbers = {1,2,3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Error.........");
        }

        try{
           int[] numbers = {1,2,3};
            System.out.println(numbers[10]);
        } catch (Exception e){
            System.out.println("Something went wrong");
        } finally {
            System.out.println("try catch ist finished");
        }

        checkAge(20);
        checkAge(15);
        checkAge(20);
    }
}

package Day02;

public class C01_javaPrintVariables {
    public static void main (String [] args) {
        String name = "John";
        System.out.println ("Hello " + name);

        String firstName ="John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println (fullName);

        int x = 5 ;
        int y = 6 ;
        System.out.println ((x+y)*(x-y));
    }
}

package Day04;

public class C02_JavaScope {

    public static void main (String[] args) { // can not be used also

        // int x = 600 can not use here
        {// Scope block started here

            int x = 100;
            System.out.println(x);

        } // endet here
    } // can not be use either
}

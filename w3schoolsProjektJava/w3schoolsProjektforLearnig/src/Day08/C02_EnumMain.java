package Day08;

public class C02_EnumMain {

    public static void main(String[] args) {

        C02_Level myVar= C02_Level.MEDIUM ;

        switch (myVar) {
            case LOW:
                System.out.println("Low Level");
                break ;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }
    }
}

package Day03;

public class C01_javaSwitch {
    public static void main ( String [ ] args ) {
        int day = 4;
        switch ( day ) {
            case 1 :
                System.out.println( " Today is Monday ");
                break;
            case 2 :
                System.out.println( " Today is Tuesday ");
                break;
            case 3 :
                System.out.println( " Today is Wednesday ");
                break;
            case 4 :
                System.out.println( " Today is Thursday ");
                break;
            case 5 :
                System.out.println( " Today is Friday ");
                break;
            case 6 :
                System.out.println( " Today is Saturday ");
                break;
            case 7 :
                System.out.println( " Today is Sunday ");
                break;
        }
        int day2 = 4 ;
        switch ( day2 ) {
            case 5 :
                System.out.println ( "Today ist Friday") ;
                break;
            case 6 :
                System.out.println ( " Today is Saturday ");
                break;
            case 7 :
                System.out.println ( " Today is Sunday ");
                break;
            default:
                System.out.println (" Looking forward to the Weekend ");
        }
    }
}

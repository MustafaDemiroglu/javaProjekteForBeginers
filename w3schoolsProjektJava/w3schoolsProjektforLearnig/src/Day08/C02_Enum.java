package Day08;

public class C02_Enum {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {

        Level myVar = Level.MEDIUM ;
        System.out.println(myVar);
    }
}

package Day02;

public class C05_javaStrings {
    public static void main ( String [ ] args ) {
        String txt = "ABKHKFKDSÖFFHKGJÖDLSÄ'FFDIPKVVMBÖLDSKGÖNSÖLKGÖOGÖL" ;
        System.out.println(txt);
        System.out.println(txt.length());

        System.out.println("");
        String txt5 = "ABKHK    FKDSÖFF    HKGJÖDLS   Ä'FFDIPKVVMB    ÖLDSKGÖNS   ÖLKGÖ   OGÖL" ;
        System.out.println(txt5);
        System.out.println(txt5.length());


        System.out.println("");
        String txt3 = "ABKHKFKDSÖFFHKGJÖDLSÄ'FFDIPKVVMBÖLDSKGÖNSÖLKGÖOGÖL" ;
        System.out.println(txt3);
        System.out.println(txt3.toLowerCase());

        System.out.println("");
        String txt2 = "qwertzuiopüasdfghjklöäyxcvbnmß" ;
        System.out.println(txt2);
        System.out.println(txt2.length());

        System.out.println("");
        String txt4 = "qwertzuiopüasdfghjklöäyxcvbnmß" ;
        System.out.println(txt4);
        System.out.println(txt4.toUpperCase());

        System.out.println("");
        String txt6 = "Please locate where 'locate' occurs!";
        System.out.println(txt6.indexOf("locate")); // Outputs 7

        System.out.println("");
        String txt7 = "i don't rellay understand. what is that. i need to learn it!!!";
        System.out.println(txt7.indexOf("is")); // Outputs 32

        System.out.println("");
        System.out.println("without concat()");
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        System.out.println("");
        System.out.println("with concat()");
        String firstName1 = "John ";
        String lastName1 = "Doe";
        System.out.println(firstName1.concat(lastName1));

        System.out.println("");
        int x = 10;
        int y = 20;
        int z = x + y;  // z will be 30 (an integer/number)
        System.out.println(z);

        System.out.println("");
        String x1 = "10";
        String y1 = "20";
        String z1 = x1 + y1;  // z1 will be 1020 (a String)
        System.out.println(z1);

        System.out.println("");
        String x2 = "10";
        int y2 = 20;
        String z2 = x2 + y2;  // z2 will be 1020 (a String)
        System.out.println(z2);

        System.out.println("");
        int x3 = 10;
        String y3 = "20";
        String z3 = x3 + y3;  // z3 will be 1020 (a String)
        System.out.println(z3);

        System.out.println("");
        String txt8 = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt8);

        System.out.println("");
        String txt9 = "It\'s alright.";
        System.out.println(txt9);

        System.out.println("");
        String txt10 = "The character \\ is called backslash.";
        System.out.println(txt10);


    }
}

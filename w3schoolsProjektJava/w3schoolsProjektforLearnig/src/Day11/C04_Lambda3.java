package Day11;

public class C04_Lambda3 {

    public static void printFormatted (String str, C04_StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }

    public static void main(String[] args) {
        C04_StringFunction exclaim = (s) -> s+ " !";
        C04_StringFunction ask = (s) -> s+ " ?";
        printFormatted ("Hello", exclaim);
        printFormatted ("Hello", ask);
    }
}

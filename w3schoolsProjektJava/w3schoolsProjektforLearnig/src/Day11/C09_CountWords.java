package Day11;

public class C09_CountWords {

    public static void main(String[] args) {

        String words = "One Two Three Four five six seven NINE teneleventwelvethirteen f o u r t e e n";
        int countwords = words.split("\\s").length;
        System.out.println(countwords);
    }
}

package Day10;

import java.util.HashMap;       // import the HashMap Class
public class C01_HashMap {

    public static void main(String[] args) {

        // Create a Hashmap object called capitalCities
        HashMap <String, String> capitalCities = new HashMap <String, String>();

        // Add keys and values ( Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Turkey", "Ankara");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("France","Paris");
        capitalCities.put("USA","Washington DC");

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Turkey"));
        System.out.println(capitalCities.get("Berlin"));
        System.out.println(capitalCities.get("France"));

        capitalCities.remove("France");
        capitalCities.remove("London");
        System.out.println(capitalCities);

        capitalCities.clear();
        System.out.println(capitalCities);

        capitalCities.put("England", "London");
        capitalCities.put("Turkey", "Ankara");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("France","Paris");
        capitalCities.put("USA","Washington DC");
        System.out.println(capitalCities.size());
        for (String i: capitalCities.keySet()){
            System.out.println(i);
        }
        for (String j: capitalCities.values()){
            System.out.println(j);
        }

        capitalCities.put("Norway", "Oslo");

        for (String i: capitalCities.keySet()) {
            System.out.println("key : " + i  + " value : " + capitalCities.get(i));
        }


    }

}

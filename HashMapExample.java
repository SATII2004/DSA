import java.util.*;

public class HashMapExample {
    public static void main(String[] args)
    {
        HashMap<String,String> countries = new HashMap<String,String>();
        // Adding elements
        countries.put("INDIA","NEW DELHI");
        countries.put("USA","WASHINGTON DC");
        countries.put("NEPAL","KATHMANDU");
        countries.put("BANDLADESH","DHAKA");
        countries.put("CHINA","BEJEING");
        countries.put("RUSSIA","MOSCOW");

        System.out.println(countries);
        System.out.println("------------------------------------------------------------");

        countries.remove("USA");

        System.out.println(countries);


        System.out.println(countries.get("RUSSIA"));

        // countries.clear();    // clear all the elements from the hashmap

        countries.replace("CHINA","PAKISTAN");

        System.out.println(countries);

       System.out.println( countries.containsKey("England"));


       System.out.println( countries.containsValue("DHAKA"));

       for(String i : countries.keySet() )
       {
        System.out.println(i + "\t"+ "=");
        System.out.println(countries.get(i));
       }


    }

}

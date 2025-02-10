
import java.util.Hashtable;

public class HashTableExample {

    public static void main(String[] args) {
        // Creating a Hashtable with an initial capacity of 10
        Hashtable<Integer, String> t = new Hashtable<>(10);

        // Adding key-value pairs
        t.put(100, "Satish");
        t.put(473, "Satish");
        t.put(422, "Satish");
        t.put(910, "Satish");
        t.put(871, "Satish");
        t.put(291, "Satish");

        // Iterating through the Hashtable and printing key-value pairs
        for (Integer key : t.keySet()) {
            System.out.println(key.hashCode()%10+"\t"+key + "\t" + t.get(key));
        }
    }
}

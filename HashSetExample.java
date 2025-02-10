import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<Integer> numbers = new HashSet<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Attempting to add a duplicate element (ignored)
        numbers.add(30);

        // Displaying HashSet elements
        System.out.println("HashSet: " + numbers);

        // Checking if an element exists
        if (numbers.contains(20)) {
            System.out.println("HashSet contains 20");
        }

        // Removing an element
        numbers.remove(40);
        System.out.println("After removing 40: " + numbers);

        // Iterating over HashSet using for-each loop
        System.out.println("Iterating over HashSet:");
        for (Integer num : numbers) {
            System.out.println(num);
        }

        // Checking size
        System.out.println("Size of HashSet: " + numbers.size());

        // Clearing all elements
        numbers.clear();
        System.out.println("HashSet after clearing: " + numbers);
    }
}

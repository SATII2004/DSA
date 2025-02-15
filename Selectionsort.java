import java.util.*;

public class Selectionsort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter values into the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // Selection Sort Algorithm - Time Complexity: O(n^2)
        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            // Swap the found smallest element with the first element
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Sorted array using Selection Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}

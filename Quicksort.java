import java.util.*;

public class Quicksort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = s.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        s.close();

        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(a));

        qsort(a, 0, n - 1);

        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(a));
    }

    public static void qsort(int[] a, int first, int last) {
        if (first < last) {
            int pivotIndex = partition(a, first, last);

            qsort(a, first, pivotIndex - 1);  // Sort left partition
            qsort(a, pivotIndex + 1, last);   // Sort right partition
        }
    }

    public static int partition(int[] a, int first, int last) {
        int pivot = a[first];  // Choosing first element as pivot
        int i = first + 1, j = last;

        while (i <= j) {
            while (i <= last && a[i] <= pivot) i++;
            while (j >= first && a[j] > pivot) j--;

            if (i < j) {
                swap(a, i, j);
            }
        }

        swap(a, first, j);  // Swap pivot with the correct position
        return j;  // Return pivot index
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

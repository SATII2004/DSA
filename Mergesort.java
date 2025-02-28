import java.util.*;

public class Mergesort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = s.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        s.close();

        System.out.println("Array before sorting:");
        System.out.println(Arrays.toString(arr));

        msort(arr, 0, n - 1);

        System.out.println("Array after sorting:");
        System.out.println(Arrays.toString(arr));
    }

    public static void msort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;

            msort(arr, l, mid);  // Left subarray
            msort(arr, mid + 1, r);  // Right subarray

            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int i = l, j = mid + 1, k = 0;
        int[] temp = new int[r - l + 1];

        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= r) {
            temp[k++] = arr[j++];
        }

        for (i = l, k = 0; i <= r; i++, k++) {
            arr[i] = temp[k];
        }
    }
}

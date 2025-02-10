import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Taking input for array dimensions
        System.out.println("Enter value of n: ");
        int n = s.nextInt();
        System.out.println("Enter value of m: ");
        int m = s.nextInt();

        // Correct 2D array declaration
        int[][] arr = new int[n][m];

        // Taking input for the 2D array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        // Displaying the 2D array elements
        System.out.println("2D Array Values are:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        s.close(); // Closing the Scanner
    }
}

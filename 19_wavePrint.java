import java.util.Scanner;

public class wavePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Give m value: ");
        int m = sc.nextInt();

        System.out.print("Give n value: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        System.out.println("Give elements in array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int col = n - 1; col >= 0; col--) {
            if (col % 2 != 0) {
                for (int row = m - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                for (int row = 0; row < m; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }

        sc.close();
    }
}
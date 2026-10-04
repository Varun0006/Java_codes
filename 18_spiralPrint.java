import java.util.Scanner;

class spiralPrint {
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

        int startRow = 0, endRow = m - 1;
        int startCol = 0, endCol = n - 1;

        while (startRow <= endRow && startCol <= endCol) {

            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            startRow++;

            for (int i = startRow; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            endCol--;

            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(arr[endRow][j] + " ");
                }
                endRow--;
            }

            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(arr[i][startCol] + " ");
                }
                startCol++;
            }
        }

        sc.close();
    }
}

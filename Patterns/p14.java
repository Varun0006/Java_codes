/*
     *********
      *     *
       *   *
        * *
         *
*/

public class p14 {
    public static void main(String[] args) {
        int n = 5;

        for (int rows = 0; rows < n; rows++) {
            for (int space = 0; space < rows; space++) {
                System.out.print(" ");
            }
            if (rows == 0) {
                for (int col = 0; col < 2 * n - 1; col++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");

                for (int space = 0; space < 2 * (n - rows - 1) - 1; space++) {
                    System.out.print(" ");
                }

                if (rows != n - 1) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}


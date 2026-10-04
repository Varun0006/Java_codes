/*
         *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
 */

public class p15 {
    public static void main(String[] args) {
        int n = 5;

        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n - row - 1; space++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (row > 0) {
                for (int space = 0; space < 2 * row - 1; space++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
        for (int row = n - 2; row >= 0; row--) {

            for (int space = 0; space < n - row - 1; space++) {
                System.out.print(" ");
            }

            System.out.print("*");
            if (row > 0) {
                for (int space = 0; space < 2 * row - 1; space++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }
            System.out.println();
        }
    }
}


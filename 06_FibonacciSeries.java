import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of terms: ");
        int terms = sc.nextInt();
        int a = 0, b = 1;

        for (int i = 0; i < terms; i++) {
            System.out.print(a + (i < terms - 1 ? " " : ""));
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        sc.close();
    }
}

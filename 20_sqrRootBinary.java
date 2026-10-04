import java.util.Scanner;

public class sqrRootBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int k = sc.nextInt();

        int low = 0;
        int high = k;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;

            if (square == k) {
                ans = mid;
                break;
            } 
            else if (square < k) {
                ans = mid;
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        System.out.println("Square root: " + ans);

        sc.close();
    }
}

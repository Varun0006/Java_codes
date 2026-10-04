import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not an Armstrong number");
            sc.close();
            return;
        }

        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;
        do {
            int digit = n % 10;
            sum += (int) Math.pow(digit, digits);
            n /= 10;
        } while (n > 0);

        System.out.println(original == sum ? "Armstrong number" : "Not an Armstrong number");
        sc.close();
    }
}


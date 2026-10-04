import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not a palindrome");
            sc.close();
            return;
        }

        int original = n, reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }

        System.out.println(original == reversed ? "Palindrome" : "Not a palindrome");
        sc.close();
    }
}


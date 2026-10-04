import java.util.Scanner;

class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Largest = " + Math.max(a, Math.max(b, c)));
        sc.close();
    }
}


import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9};
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int index = search(arr, target, 0);
        System.out.println(index == -1 ? "Element not found" : "Found at index " + index);
        sc.close();
    }

    static int search(int[] arr, int target, int index) {
        if (index >= arr.length) return -1;
        if (arr[index] == target) return index;
        return search(arr, target, index + 1);
    }
}

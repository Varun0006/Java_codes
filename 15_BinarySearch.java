import java.util.Scanner;

class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72};
        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int low = 0, high = arr.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(result == -1 ? "Element not found" : "Found at index " + result);
        sc.close();
    }
}


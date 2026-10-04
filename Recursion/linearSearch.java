public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7, 8, 9};
        int target = 4;

        System.out.println(search(arr, target, 0));
    }

    static boolean search(int[] arr, int target, int index) {

        // Base condition
        if (index == arr.length) {
            return false;
        }

        if (arr[index] == target) {
            return true;
        }
        return search(arr, target, index + 1);
    }
}
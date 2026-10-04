public class SecondLargestArray {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > largest) {
                second = largest;
                largest = value;
            } else if (value > second && value < largest) {
                second = value;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No distinct second-largest value");
        } else {
            System.out.println("Second largest = " + second);
        }
    }
}

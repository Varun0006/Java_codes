
public class selectionSort {
    int[] arr;
    int n;

    public selectionSort(int[] arr) {
        this.arr = arr;
        this.n = arr.length;
    }

    public void display() {
        for (int i = 0; i < n - 1; i++) {

            int min_pos = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_pos]) {
                    min_pos = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_pos];
            arr[min_pos] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};

        selectionSort obj = new selectionSort(numbers);
        obj.display();
    }
}

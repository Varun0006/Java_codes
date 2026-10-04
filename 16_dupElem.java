import java.util.Scanner;
class dupElem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();

        int[] myArr = new int[n];

        System.out.println("Enter elements in array:");
        for (int i = 0; i < n; i++) {
            myArr[i] = sc.nextInt();
        }

        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (myArr[i] == myArr[j]) {
                    c++;
                }
            }
        }

        if (c >= 1) {
            System.out.println("Duplicate Elements Exist");
        } else {
            System.out.println("No Duplicate Elements Exist");
        }

        sc.close();
    }
}


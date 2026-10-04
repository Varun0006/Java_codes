public class powerFunction {

    public static void main(String[] args) {
        System.out.println(power(2, 2));
        System.out.println(powerFast(2, 2));
    }

    static int power(int a, int n) {
        if (n == 1) {
            return a;
        }
        return a * power(a, n - 1);
    }

    static int powerFast(int a, int n) {
        if (n == 1) {
            return a;
        }

        int half = powerFast(a, n / 2);
        if (n % 2 == 0) {
            return half * half;
        }
        return half * half * a;
    }
}
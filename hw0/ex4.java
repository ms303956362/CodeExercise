public class ex4 {
    public static void windowPosSum(int[] a, int n) {
        /** your code here */
        int sum = 0;
        for (int i = 0; i < a.length && i <= n; ++i) {
            sum += a[i];
        }
        for (int i = 0, j = n + 1; i < a.length; ++i) {
            int tmp = a[i];
            if (a[i] > 0) {
                a[i] = sum;
            }
            sum -= tmp;
            if (j < a.length) {
                sum += a[j];
                ++j;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
//        int[] a = {1, -1, -1, 10, 5, -1};
//        int n = 2;
        windowPosSum(a, n);

        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
    }
}

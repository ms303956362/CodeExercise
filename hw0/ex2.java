public class ex2 {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int ans = 0;
        for (int num : m) {
            if (num > ans)
                ans = num;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        int max_num = max(numbers);
        System.out.println(max_num);
    }
}

public class ex1b {
    public static void drawTriangle (int N) {
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        drawTriangle(10);
    }
}
public class Recursion_TilingProblem {
    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int verticalC = tilingProblem(n-1);
        int horizontalC = tilingProblem(n-2);
        int totways = verticalC + horizontalC;
        return totways;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}

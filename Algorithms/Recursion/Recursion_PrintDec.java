public class Recursion_PrintDec {
    public static void printDec(int n) {
        // Base case
        if (n == 1) {
            System.out.print(n);
            return;
        }
        // recursion
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void main(String[] args) {
        printDec(10);
    }
}

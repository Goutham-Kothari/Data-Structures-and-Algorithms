public class Recursion_PrintAsc {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        printDec(n-1);
        System.out.print(n + " ");
    }
  
    public static void main(String[] args) {
        printDec(10);
    }
}

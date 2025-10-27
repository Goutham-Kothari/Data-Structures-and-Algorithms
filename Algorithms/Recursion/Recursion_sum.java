import java.util.Scanner;

public class Recursion_sum {
    public static int nSum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + nSum(n-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for n : ");
        int n = sc.nextInt();
        System.out.println(nSum(n));
        sc.close();
    }
}

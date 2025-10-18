import java.util.Scanner;

public class Linear_Search {

    static int arr[];
    static int size;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        inputsToArray(sc);
        System.out.print("Enter the Element to Search : ");
        int key = sc.nextInt();
        boolean found = linearSearch(arr, key);
        if (found == true) {
            System.out.println("Element Found ");
        } else {
            System.out.println("Element NOT Found");
        }
        
        sc.close();
    }

    public static void inputsToArray(Scanner sc) {

        System.out.print("Enter the size of Array :");
        size = sc.nextInt();
        arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value for "+i+" th index : ");
            arr[i] = sc.nextInt();
        }
    }

    public static boolean linearSearch(int a[], int key) {
        for (int i = 0; i < size; i++) {
            if (key == a[i]) {
                return true;
            }
        }
        return false;
    }
}

import java.util.Scanner;

public class ArraysCC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array size
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        // declaration
        int arr[] = new int[size];
        // int arr2[] = {1,2,3};

        // input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value for "+i+" index : ");
            arr[i] = sc.nextInt();
        }

        dis(arr);
        update(arr);
        System.out.println("Method to demonstrate call by reference update in another method");
        dis(arr);

        sc.close();
    }

    // display method
    public static void dis(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("Index : " + i + " Value = " + a[i]);
        }
    }

    // method to demonstrate call by reference in array
    public static void update(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 1;
        }
    }
}
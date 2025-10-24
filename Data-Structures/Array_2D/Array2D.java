import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the no of colums : ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        System.out.println("Enter the array element");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
        System.out.println((search(arr, 5) == true) ? "Found" : "Not found");
        minandmax(arr);
        sc.close();
    }

    public static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean search(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void minandmax(int arr[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                largest = Math.max(largest, arr[i][j]);
                smallest = Math.min(smallest, arr[i][j]);
            }
        }
        System.out.println("Largest element = " + largest);
        System.out.println("Smallest element = " + smallest);
    }
}

public class Insertion_Sort {

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
        prithArr(arr);
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // find out currect posiyion to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
    }

    public static void prithArr(int arr[]) {
        System.out.print("Sorted Array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

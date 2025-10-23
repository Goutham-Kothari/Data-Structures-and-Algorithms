public class Selection_Sort {

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectionSort(arr);
        prithArr(arr);
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            // swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void prithArr(int arr[]) {
        System.out.print("Sorted Array ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

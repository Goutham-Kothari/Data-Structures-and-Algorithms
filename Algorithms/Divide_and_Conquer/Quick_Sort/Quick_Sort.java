public class Quick_Sort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-2,5};
        quickSort(arr, 0, arr.length-1);
        display(arr);
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivotIndex = partition(arr, si, ei);
        quickSort(arr, si, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // last element as pivot
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = arr[i+1];
        arr[i+1] = arr[ei];
        arr[ei] = temp;

        return i + 1;
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

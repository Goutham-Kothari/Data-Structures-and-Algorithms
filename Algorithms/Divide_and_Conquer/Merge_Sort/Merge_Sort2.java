public class Merge_Sort2 {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-2,5};
        mergeSort(arr, 0, arr.length-1);
        display(arr);
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int n1 = mid - si + 1;
        int n2 = ei - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = arr[si+i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid+1+j];
        }

        // Merge the temp arrays back into arr[left..right]
        int i = 0, j = 0;
        int k = si;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of L[]
        while (i < n1) {
            arr[k++] = L[i++];
        }
        // Copy remaining elements of R[]
        while (i < n2) {
            arr[k++] = R[j++];
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class BackTracking {
    public static void arrayChange(int arr[], int i, int val) {
        // Base case
        if (i == arr.length) {
            print(arr);
            return;
        }
        // Recursive case
        arr[i] = val;
        arrayChange(arr, i+1, val+1); // funtion call step
        arr[i] = arr[i] - 2; // backtacking step
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int num[] = new int[5];
        arrayChange(num, 0, 2);
        print(num);
    }
}

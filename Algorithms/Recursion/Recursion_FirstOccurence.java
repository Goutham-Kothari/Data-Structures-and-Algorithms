public class Basic_Recursion {
    public static int firstOccurence(int arr[], int key, int i) {
        if (arr[i] == key) {
            return i;
        }
        if (i == arr.length) {
            return -1;
        }
        return firstOccurence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,5,6,7,3,4,1};
        System.out.println(firstOccurence(arr,5,0));
    }
}

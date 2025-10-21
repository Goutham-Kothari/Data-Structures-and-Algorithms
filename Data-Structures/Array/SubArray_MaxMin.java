public class SubArray_MaxMin {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubArray(numbers);
    }

    public static void printSubArray(int numbers[]) {
        int totalSubArray = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];
                }
                System.out.println("Sum = "+sum);
                if (sum <= smallest) {
                    smallest = sum;
                }
                if (sum >= largest) {
                    largest = sum;
                }
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray = " + totalSubArray);
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}

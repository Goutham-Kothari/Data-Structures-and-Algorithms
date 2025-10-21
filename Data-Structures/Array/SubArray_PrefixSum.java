public class SubArray_PrefixSum {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printSubArray(numbers);
    }

    public static void printSubArray(int numbers[]) {
        int prefix[] = new int[numbers.length];
        int maxSum = Integer.MIN_VALUE;

        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for (int i = 0; i < prefix.length; i++) {
            int currSum = 0;
            for (int j = i; j < prefix.length; j++) {
                currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i-1];
            }
            if (maxSum <= currSum) {
                maxSum = currSum;
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }
}

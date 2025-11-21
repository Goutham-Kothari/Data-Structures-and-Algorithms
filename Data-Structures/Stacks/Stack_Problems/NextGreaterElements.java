import java.util.*;
public class NextGreaterElements {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int arr[] = {6, 8, 0, 1, 3};
        int nextGreater[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            // 1 while loop
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            // 2 if-else
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = arr[s.peek()];
            }
            // 3 push
            s.push(i);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(nextGreater[i] + " ");
        }
    }
}

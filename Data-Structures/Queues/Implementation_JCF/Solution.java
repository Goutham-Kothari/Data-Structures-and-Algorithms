import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
      // Queue<Integer> q = new ArrayDeque<>();
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q);
        System.out.println(q.peek());
        q.remove();
        System.out.println(q);
    }
}

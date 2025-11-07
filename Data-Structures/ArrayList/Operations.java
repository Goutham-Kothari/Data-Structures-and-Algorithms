import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // add O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1, 7); //O(n)
        System.out.println(list);

        // get O(1)
        int element = list.get(2);
        System.out.println(element);

        // remove O(n)
        list.remove(2);
        System.out.println(list);

        // set  O(n)
        list.add(5);
        list.set(2, 10);
        System.out.println(list);

        // contains O(n)
        System.out.println(list.contains(2));
        System.out.println(list.contains(14));
    }
}

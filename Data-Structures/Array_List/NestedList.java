import java.util.ArrayList;
import java.util.Collections;

public class NestedList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);

        System.out.println(mainList);
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        ArrayList<ArrayList<Integer>> mainList2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        ArrayList<Integer> list5 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list3.add(i*1);
            list4.add(i*2);
            list5.add(i*3);
        }
        mainList2.add(list3);
        mainList2.add(list4);
        mainList2.add(list5);

        System.out.println(mainList2);
        for (int i = 0; i < mainList2.size(); i++) {
            ArrayList<Integer> currList2 = mainList2.get(i);
            for (int j = 0; j < currList2.size(); j++) {
                System.out.print(currList2.get(j) + " ");
            }
            System.out.println();
        }
    }
}

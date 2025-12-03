import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public static void main(String[] args) {

        // Indian coin denominations
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 200, 500};

        // Sort in descending order (Greedy choice)
        Arrays.sort(coins, Comparator.reverseOrder());

        int amount = 1383;
        int countCoins = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // Greedy algorithm
        for (int coin : coins) {
            while (coin <= amount) {
                ans.add(coin);
                amount -= coin;
                countCoins++;
            }
        }

        // Output
        System.out.println("Total minimum coins used = " + countCoins);
        System.out.println("Coins used: " + ans);
    }
}

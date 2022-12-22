import java.util.ArrayList;

public class GreedyCoins {

    public static void main(String[] args) {

        int price = 47;
        ArrayList<Integer> coins = new ArrayList<Integer>();
        initCoins(coins);

        greedyCoins(price, coins);

    }

    public static void initCoins(ArrayList<Integer> coins) {
        coins.add(1);
        coins.add(5);
        coins.add(10);
        coins.add(25);
        coins.add(50);
    }

    public static void greedyCoins(int price, ArrayList<Integer> coins) {
        int i = coins.size() - 1;
        while (price > 0) {
            if (price >= coins.get(i)) {
                System.out.printf("Chose %d \n", coins.get(i));
                price -= coins.get(i);
                System.out.printf("Price left: %d\n", price);
                System.out.println();
            } else {
                i--;
            }
        }
    }





}

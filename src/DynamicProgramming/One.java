package DynamicProgramming;

public class One {

    public static void main(String[] args) {

        int[] V = {3, 5, 7, 9, 11};
        int S = 17;

        boolean result = isSubsetSum(V, V.length, S);
        System.out.println(result);

    }

    public static boolean isSubsetSum(int[] set, int n, int sum) {
        if (sum == 0) {
            return true;
        }
        if (n == 0 && sum != 0) {
            return false;
        }
        if (set[n - 1] > sum) {
            return isSubsetSum(set, n - 1, sum);
        }
        return isSubsetSum(set, n - 1, sum) || isSubsetSum(set, n - 1, sum - set[n - 1]);
    }

}

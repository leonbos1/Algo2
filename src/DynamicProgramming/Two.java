package DynamicProgramming;

public class Two {

    //Problem: Given a set of items, each with a weight and a value,
    // determine the maximum total value of items that can be included in a knapsack with a maximum weight capacity.

    public static void main(String[] args) {

        int[] weights = {1, 2, 3, 4, 5};
        int[] values = {1, 4, 5, 7, 9};

        if (weights.length != values.length) {
            return;
        }

        int maxValue = knapSack(10, weights, values, weights.length);

        System.out.println(maxValue);
    }


    public static int knapSack(int weight, int[] weights, int[] values, int index) {

        if (index == 0 || weight == 0) {
            return 0;
        }

        if (weights[index - 1] > weight) {
            return knapSack(weight, weights, values, index - 1);
        }

        //return wat de maximale value terug geeft: deze value gebruiken of deze overslaan.
        return Math.max(
                values[index - 1] + knapSack(weight - weights[index - 1], weights, values, index - 1),
                knapSack(weight, weights, values, index - 1));

    }




}

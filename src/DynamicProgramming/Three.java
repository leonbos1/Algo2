package DynamicProgramming;

import java.util.Arrays;

public class Three {

    // given an array [1,1,0,0,0,1,1,0,0,1,1,1,1,0,0,0,0,]
    // using dynamic programming
    // return the length of longest concurring subarray of 0's or 1's

    public static void main(String[] args) {
        int[] list = {1,1,0,0,1,1,1,0,0,0,0,1,1,0,1};

        int concurring = LongestConcurring(list, 0, list.length);

        System.out.println(concurring);

    }

    public static int LongestConcurring(int[] list, int start, int end) {

        if (start == end - 1) {
            return 1;
        }

        boolean allSame = true;
        for (int i = start; i < end - 1; i++) {
            if (list[i] != list[i + 1]) {
                allSame = false;
                break;
            }
        }

        if (allSame) {
            return end - start;
        }

        //return het maximale van drie mogelijke subarrays, start + 1, end - 1, start + 1 EN end - 1
        return Math.max(LongestConcurring(list, start + 1, end),
                LongestConcurring(list, start, end - 1)
        );
    }

}

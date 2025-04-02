package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] candies1 = { 5, 8, 6 };
        System.out.println(maximumCandiesAllocatedToKChildren(candies1, 3));

        int[] candies2 = { 2, 5 };
        System.out.println(maximumCandiesAllocatedToKChildren(candies2, 11));

    }

    public static int maximumCandiesAllocatedToKChildren(int[] candies, int k) {

        int distribute = candies[0];

        for (int i = 0; i < candies.length; i++) {

            if (candies[i] < distribute) {
                distribute = candies[i];
            }

        }

        while (distribute > 0) {

            int validKids = candies.length;

            for (int i = 0; i < candies.length; i++) {

                validKids = validKids + (candies[i] / k) - 1;

            }

            if (validKids >= k) { return distribute; }

            distribute--;

        }

        return 0;

    }

}

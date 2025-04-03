package com.project.attempt;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] candies1 = { 5, 8, 6 };
        System.out.println(maximumCandiesAllocatedToKChildren(candies1, 3));

        int[] candies2 = { 2, 5 };
        System.out.println(maximumCandiesAllocatedToKChildren(candies2, 11));

    }

    // This method returns the maximum amount of candies that can be equally
    // distributed to all int k children.
    public static int maximumCandiesAllocatedToKChildren(int[] candies, int k) {

        // First off, since the challenge specifications clearly stated that we are
        // not allowed to merge piles, this necessarily means that the answer cannot
        // be any higher than the highest value in int[] candies, as we can't merge
        // to increase that value no matter what. Hence, we set int distribute to a
        // default value of whatever the highest value in int[] candies. We will later
        // perform some logic on int distribute to figure out what the highest number
        // of candies that can be equally distributed to all kids is.
        int distribute = candies[0];

        for (int i = 0; i < candies.length; i++) {

            if (candies[i] > distribute) {
                distribute = candies[i];
            }

        }

        // We will then perform a while-loop that will test every value of int distribute,
        // starting from the initial value and then gradually testing every value until
        // it becomes 0 to see the highest value that can work in distributing candies
        // to all kids equally.
        while (distribute > 0) {

            // We will store the total number of kids that are able to receive
            // int distribute amount of candies with int validKids.
            int validKids = 0;

            // For the default value of int validKids, we will perform a simple
            // loop to see how many elements in int[] candies has a value equal to
            // or more than the current value of int distribute. If the value of
            // candies[i] at any index i has a value that is more than double the
            // current value of int distribute, that means it can be divided into
            // multiple piles of int distribute size, so we will take that into
            // consideration when performing our calculations as well, making sure
            // to increment int validKids by however many piles of int distribute
            // size that specific value of candies[i] can be divided into.
            for (int i = 0; i < candies.length; i++) {

                validKids = validKids + (candies[i] / distribute);

            }

            // Once we obtained the maximum valid number of children that we can
            // allocate int distribute amount of candies to, we compare that number of
            // children to int k to see if it satisfies the challenge specifications.
            // If int validKids does not equal to or surpass int k, then that means
            // the current value of int distribute does not work to distribute an
            // equal number of candies to int k amount of children. If it is however,
            // then that means we have attained the largest amount of candies that
            // be distributed to int k children, and we return int distribute.
            if (validKids >= k) { return distribute; }

            // At the end of the loop, we decrement the value of int distribute by 1
            // in order to test the next value of int distribute.
            distribute--;

        }

        // If we finish the loop without ever managing to find a valid value for int validKids,
        // then that means there is no amount of candies that will work to distribute candies
        // equally to int k children. As such, we return 0 in such a case.
        return 0;

    }

}

package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void maximumCandiesTest() {

        int[] candies1 = { 5, 8, 6 };
        assertEquals(5, LeetCodeSolution.maximumCandies(candies1, 3));

        int[] candies2 = { 2, 5 };
        assertEquals(0, LeetCodeSolution.maximumCandies(candies2, 11));

    }

}

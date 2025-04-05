package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void maximumCandiesAllocatedToKChildrenTest() {

        int[] candies1 = { 5, 8, 6 };
        assertEquals(5, LeetCodeAttempt.maximumCandiesAllocatedToKChildren(candies1, 3));

        int[] candies2 = { 2, 5 };
        assertEquals(0, LeetCodeAttempt.maximumCandiesAllocatedToKChildren(candies2, 11));

    }

}

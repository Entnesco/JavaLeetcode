package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void Test1() {
        var solution = new Solution();
        assertEquals(Arrays.toString(new int[]{0, 1}), Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    @Test
    void Test2() {
        var solution = new Solution();
        assertEquals(Arrays.toString(new int[]{1, 2}), Arrays.toString(solution.twoSum(new int[]{3, 2, 4}, 6)));
    }

    @Test
    void Test3() {
        var solution = new Solution();
        assertEquals(Arrays.toString(new int[]{0, 1}), Arrays.toString(solution.twoSum(new int[]{3,3}, 6)));
    }
}
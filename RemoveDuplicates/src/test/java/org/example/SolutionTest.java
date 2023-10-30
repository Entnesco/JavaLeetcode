package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test112233(){
        var solution = new Solution();
        assertArrayEquals(new int[]{1,2,3,3,3,3}, solution.removeDuplicates(new int[] {1,1,2,2,3,3}));
    }
    @Test
    void test112(){
        var solution = new Solution();
        assertArrayEquals(new int[]{1,2,2},solution.removeDuplicates(new int[] {1,1,2}));
    }
    @Test
    void test0011122334(){
        var solution = new Solution();
        assertArrayEquals(new int[]{0,1,2,3,4,4,4,4,4,4}, solution.removeDuplicates(new int[] {0,0,1,1,1,2,2,3,3,4}));
    }

}
package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test123(){
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1,2,4}, solution.plusOne(new int[]{1,2,3}));
    }

    @Test
    void test4321(){
        Solution solution = new Solution();
        assertArrayEquals(new int[]{4,3,2,2}, solution.plusOne(new int[]{4,3,2,1}));
    }

    @Test
    void test9(){
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1,0}, solution.plusOne(new int[]{9}));
    }

}
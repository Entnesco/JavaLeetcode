package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test121(){
        var solution = new Solution();
        assertEquals(true, solution.isPalindrome(121));
    }

    @Test
    void testNegative121(){
        var solution = new Solution();
        assertEquals(false, solution.isPalindrome(-121));
    }

    @Test
    void test10(){
        var solution = new Solution();
        assertEquals(false, solution.isPalindrome(10));
    }

}
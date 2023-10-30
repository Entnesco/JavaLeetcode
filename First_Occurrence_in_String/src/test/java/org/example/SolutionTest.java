package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test_sadbutsad_sad(){
        var solution = new Solution();
        assertEquals(0,solution.strStr("sadbutsad", "sad"));
    }

    @Test
    void test_leetcode_leeto(){
        var solution = new Solution();
        assertEquals(-1,solution.strStr("leetcode", "leeto"));
    }

    @Test
    void test_a_a(){
        var solution = new Solution();
        assertEquals(0,solution.strStr("a", "a"));
    }

}
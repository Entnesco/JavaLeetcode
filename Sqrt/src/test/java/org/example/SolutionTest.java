package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test4(){
        Solution solution = new Solution();
        assertEquals(2,solution.mySqrt(4));
    }

    @Test
    void test8(){
        Solution solution = new Solution();
        assertEquals(2,solution.mySqrt(8));
    }

    @Test
    void test1(){
        Solution solution = new Solution();
        assertEquals(1,solution.mySqrt(1));
    }

    @Test
    void test2147483647(){
        Solution solution = new Solution();
        assertEquals(46340,solution.mySqrt(2147483647));
    }

}
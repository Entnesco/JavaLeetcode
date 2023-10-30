package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testValidRoundBrackets(){
        var solution = new Solution();
        assertTrue(solution.isValid("(())"));
    }
    @Test
    void testNotValidRoundBrackets(){
        var solution = new Solution();
        assertFalse(solution.isValid("((())"));
    }
    @Test
    void testValidMixBrackets(){
        var solution = new Solution();
        assertTrue(solution.isValid("()[]{}"));
    }
    @Test
    void testNotValidMixBrackets(){
        var solution = new Solution();
        assertFalse(solution.isValid("(]"));
    }
    @Test
    void testNotValidMixBrackets2(){
        var solution = new Solution();
        assertFalse(solution.isValid("([)]"));
    }

}
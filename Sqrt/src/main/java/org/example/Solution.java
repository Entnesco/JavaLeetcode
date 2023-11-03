package org.example;

class Solution {
    public int mySqrt(int x) {

        int half_x = x/2;

        for(int i = 1; i <= half_x+1; i++){
            if( (long) i *i == x) return i;
            else if( (long) i *i > x) return i-1;
        }
        return 0;
    }
}

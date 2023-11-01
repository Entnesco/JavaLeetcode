package org.example;

class Solution {
    public int[] plusOne(int[] digits) {

        for(int i = digits.length-1; i >= 0; i--){
            digits[i]++;
            if(digits[i] < 10) break;
            else{
                digits[i] = 0;
            }
            if(i == 0 && digits[i] == 0){
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                for (int j = 0; j < digits.length; j++) {
                    newDigits[j+1] = digits[j];
                }
                return newDigits;
            }
        }

        return digits;
    }
}

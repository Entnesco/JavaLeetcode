package org.example;

class Solution {
    public int[] removeDuplicates(int[] nums) {
        int counter = 0;
        for(int i = 0; i <nums.length-1; i++){
            counter++;
            if(counter> nums.length) break;
            if(nums[i]==nums[i+1]){
                for(int j = i; j < nums.length - 1; j++)
                {
                    nums[j] = nums[j+1];
                }
                i--;
            }
        }
        return nums;
    }
}

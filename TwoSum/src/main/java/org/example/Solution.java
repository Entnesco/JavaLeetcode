package org.example;

public class Solution {
    public int[] twoSum(int[] nums, int target) {

        int i = 0;
        int j = 0;


        for(i = 0; i < nums.length; i++)
        {
            for(j = i+1; j<nums.length-1; j++)
            {
                if(nums[i]+nums[j] == target) break;
            }
            if(nums[i]+nums[j] == target) break;
        }

        int[] output = {i, j};


         return output;
    }
}

package org.example;

public class Main {


    public static void main(String[] args) {
        int[] nums= {3,2,4};
        int target = 6;

        Solution solution = new Solution();
        int[] output = solution.twoSum(nums, target);

        for(int i = 0; i < output.length; i++)
        {
            System.out.print(output[i] + ", ");
        }

    }
}
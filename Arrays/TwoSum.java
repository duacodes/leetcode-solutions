/*
Problem: Two Sum
Difficulty: Easy
Topic: Arrays
Approach: Check every pair and return the two indices whose sum equals target.
Time Complexity: O(n²)
Space Complexity: O(1)
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j < nums.length ; j++){
                if(nums[i]+ nums[j] == target)
                    return new int[] {i,j};
            }
        }
        return new int[] {};
    }
}

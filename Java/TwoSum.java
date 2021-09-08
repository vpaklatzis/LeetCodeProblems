/**
* Given an array of integers nums and an integer target,
* return indices of the two numbers such that they add up to target.
* You may assume that each input would have exactly one solution,
* and you may not use the same element twice.
* You can return the answer in any order.
* Follow-up: Can you come up with an algorithm that is less than O(n^2) time complexity?
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int fixedNum, i , j;
        int[] numIndices = new int[2];
        
        for(i=0; i<nums.length - 1; i++) {
            fixedNum = nums[i];
            for(j=i+1; j<nums.length; j++) {
                if(fixedNum + nums[j] == target) {
                    numIndices[0] = i;
                    numIndices[1] = j;
                    break;
                }
            }
        }
        return numIndices;
    }
}
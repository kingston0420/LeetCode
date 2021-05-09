class Solution {
    public int searchInsert(int[] nums, int target) {
        int endIndex = nums.length;
        int startIndex = 0;
        int midIndex = 0;
        
        while (startIndex<endIndex) {
            midIndex = (startIndex+endIndex)/2;
            if (target == nums[midIndex]) {
                return midIndex;
            }
            else if (target > nums[midIndex]) {
                startIndex = midIndex + 1;
            } else {
                endIndex = midIndex;
            }
        }
        return startIndex;
    }
}

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
Example 4:

Input: nums = [1,3,5,6], target = 0
Output: 0
Example 5:

Input: nums = [1], target = 0
Output: 0
 

Constraints:

1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
*/
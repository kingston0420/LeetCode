/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

 

Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6
 

Constraints:

3 <= nums.length <= 104
-1000 <= nums[i] <= 1000
*/

class Solution {
    public int maximumProduct(int[] nums) {
        int length = nums.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for (int i=0; i<length; i++) {
            int number = nums[i];
            if (number>max1) {
                max3 = max2;
                max2 = max1;
                max1 = number;
            }
            else if (number>max2) {
                max3 = max2;
                max2 = number;
            }
            else if (number>max3) {
                max3 = number;
            }
            if (number<min1) {
                min2 = min1;
                min1 = number;
            }
            else if (number<min2) {
                min2 = number;
            }
        }
        return Math.max(min1*min2*max1, max3*max2*max1);
    }
}

//Find three largest values and two smalles value
//Compare (min1, min2, max1) with (max3, max2, max1)
//Time: O(N)
//Space: O(1)
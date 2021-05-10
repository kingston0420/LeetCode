/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

 

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
0 <= k <= 105
*/

bool containsNearbyDuplicate(int* nums, int numsSize, int k){
    for (int i=0; i<numsSize; i++) {
        int upper = (k+i+1>numsSize)?numsSize:k+i+1;
        for (int j=i+1; j<upper; j++) {
            if (nums[i]==nums[j])
                return true;
        }
    }
    return false;
}
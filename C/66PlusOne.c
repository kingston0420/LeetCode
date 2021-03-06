/*
Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Example 3:

Input: digits = [0]
Output: [1]
 

Constraints:

1 <= digits.length <= 100
0 <= digits[i] <= 9
*/



/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* plusOne(int* digits, int digitsSize, int* returnSize){
    //calculate the last digit, see if there is carry over
    //if carry then do the same thing for the digit before
    //else we are done;
    bool carry = false;
    int sum = 0;
    int* result = (int*)malloc((digitsSize+1)*sizeof(int)); 
    *returnSize = digitsSize;
    
    for (int i=digitsSize-1; i>=0; i-- ) {
        if (digits[i] == 9) {
            carry = true;
            digits[i] = 0;
        }
        else {
            digits[i] = digits[i] + 1;
            return digits;
        }   
    }
    if (carry) {
        result[0] = 1;
        for (int i=1; i<digitsSize + 1; i++) {
            result[i] = digits[i-1];
        }
        *returnSize = (*returnSize) + 1;
        return result;
    }
    return digits;
}
/*
The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,

F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).

 

Example 1:

Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
Example 2:

Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
Example 3:

Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
 

Constraints:

0 <= n <= 30
*/

//Iterative
class Solution {
    public int fib(int n) {
        if (n<2)
            return n;
        int n2 = 0;
        int n1 = 1;
        int curr = 1;
        
        for (int i=2; i<n+1; i++) {
            curr = n1+n2;
            n2 = n1;
            n1 = curr;
        }
        return curr;
    }   
}
//Time: O(N)
//Space: O(1)

//Recursion
/*
class Solution {
    public int fib(int n) {
        return fibCal(n);
    }
    
    public int fibCal (int n) {
        if (n==0)
            return 0;
        else if (n==1)
            return 1;
        return fibCal(n-1) + fibCal(n-2);
        
    }
}
*/
//Time: O(2^N)
//Space: O(N)
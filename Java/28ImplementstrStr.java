/*
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Example 3:

Input: haystack = "", needle = ""
Output: 0
 

Constraints:

0 <= haystack.length, needle.length <= 5 * 104
haystack and needle consist of only lower-case English characters.
*/

class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length()==0)
            return 0;
        for (int i=0; i<haystack.length(); i++) {
            int j=0;
            int count = 0;
            if (haystack.charAt(i)==needle.charAt(j)) {
                while (j<needle.length() && i+j<haystack.length()){
                    if (haystack.charAt(i+j)==needle.charAt(j))
                        count++;
                    j++;
                }
            }
            if (count == needle.length())
                return i;
        }
        return -1;
    }
}
//Time: O(M*N)
//Space: O(1)
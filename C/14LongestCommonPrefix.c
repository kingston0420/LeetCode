/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
*/

char output[200] = "";
char * longestCommonPrefix(char ** strs, int strsSize){
    if (strsSize == 0 || strs == NULL)
        return "";
    //Loop through every char in the first string
    //Compare with every first char in the other string
    //continue if they are the same
    //stop at the index when they are not the same.
    //return the substring of the first string
    int curr_char = 0;
    char c = strs[0][0];
    while (c != '\0') {
        for (int i=1; i<strsSize; i++) {
            if (strs[i][curr_char]!=c || strs[i][curr_char]=='\0') {
                output[curr_char] = '\0';
                return output;
            }
        }
        output[curr_char] = c;
        curr_char++;
        c = strs[0][curr_char];
    }
    output[curr_char] = '\0';
    return output;
}
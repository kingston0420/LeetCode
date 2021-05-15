/*
Given an array of strings wordsDict and two different strings that already exist in the array word1 and word2, return the shortest distance between these two words in the list.

 

Example 1:

Input: wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "coding", word2 = "practice"
Output: 3
Example 2:

Input: wordsDict = ["practice", "makes", "perfect", "coding", "makes"], word1 = "makes", word2 = "coding"
Output: 1
 

Constraints:

1 <= wordsDict.length <= 3 * 104
1 <= wordsDict[i].length <= 10
wordsDict[i] consists of lowercase English letters.
word1 and word2 are in wordsDict.
word1 != word2
*/


class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int length = wordsDict.length;
        int index1 = -1;
        int index2 = -1;
        int minDist = length;
        for (int i=0; i<length; i++) {
            if (wordsDict[i].equals(word1)) 
                index1 = i;
            else if (wordsDict[i].equals(word2))
                index2 = i;
            if (index1!=-1 && index2!=-1) {
                int dist = Math.abs(index1-index2);
                if (dist<minDist)
                    minDist = dist;
                if (minDist == 1)
                    return minDist;
            }
        }
        return minDist;
    }
}
//Time: O(N*M) where NN is the number of words in the input list, and MM is the total length of two input words.
//Space: O(1)

//brute force
/*
class Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int length = wordsDict.length;
        int minDist = Integer.MAX_VALUE;
        for (int i=0; i<length; i++) {
            if (wordsDict[i].equals(word1)) {
                for (int j=0; j<length; j++) {
                    if (wordsDict[j].equals(word2)) {
                        if (Math.abs(j-i) < minDist) {
                            minDist = Math.abs(j-i);
                        }
                    }
                }
            }
        }
        return minDist;
    }
}
*/
//Time: O(N^2)
//Space: O(1)
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

int shortestDistance(char ** wordsDict, int wordsDictSize, char * word1, char * word2){
    int index1 = -1;
    int index2 = -1;
    int minDist = wordsDictSize;
    for (int i=0; i<wordsDictSize; i++) {
        if (strcmp(wordsDict[i], word1)==0) {
            index1 = i;
        }
        else if (strcmp(wordsDict[i], word2)==0) {
            index2 = i;
        }
        if (index1!=-1 && index2!=-1) {
            int dist = abs(index1 - index2);
            if (dist<minDist) {
                minDist = dist;
            }
            if (minDist == 1) {
                return minDist;
            }
        }
    }
    return minDist;
}
//Time: O(N⋅M) where N is the number of words in the input list, and M is the total length of two input words.
//Space: O(1)
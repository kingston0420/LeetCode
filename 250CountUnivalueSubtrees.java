/*
Given the root of a binary tree, return the number of uni-value subtrees.

A uni-value subtree means all nodes of the subtree have the same value.

 

Example 1:


Input: root = [5,1,5,5,5,null,5]
Output: 4
Example 2:

Input: root = []
Output: 0
Example 3:

Input: root = [5,5,5,5,5,null,5]
Output: 6
 

Constraints:

The numbrt of the node in the tree will be in the range [0, 1000].
-1000 <= Node.val <= 1000
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count = 0;
    
    public int countUnivalSubtrees(TreeNode root) {
        if (root==null) return 0;
        isUni(root);
        return count;
                
    }
    
    public boolean isUni (TreeNode node) {
        if (node.left==null && node.right==null){
            count++;
            return true;
        }
        else if (node.left==null && node.right!=null) {
            if (isUni(node.right) && node.right.val==node.val) {
                count++;
                return true;
            }
        }
        else if (node.left!=null && node.right==null) {
            if (isUni(node.left) && node.left.val==node.val) {
                count++;
                return true;
            }
        }
        else {
            boolean temp1 = isUni(node.left) ;
            temp1 = isUni(node.right) && temp1 && (node.left.val==node.val && node.right.val==node.val) ;
            if (temp1) {
                count++;
                return true;
            }
        }
        
        return false;
    }
    
}
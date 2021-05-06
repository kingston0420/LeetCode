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
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        
        return isMirror(root.left, root.right);
    }
    
    public boolean isMirror(TreeNode left, TreeNode right) {
        //They if one of them is null and the other is not then it's false
        //If they are both null then it is true
        if (left==null || right==null) return left==right;
        if (left.val != right.val) return false;
        
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}

/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

 

Example 1:


Input: root = [1,2,2,3,4,4,3]
Output: true
Example 2:


Input: root = [1,2,2,null,3,null,3]
Output: false
 

Constraints:

The number of nodes in the tree is in the range [1, 1000].
-100 <= Node.val <= 100
*/
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> output = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return output;
        else queue.offer(root);
        TreeNode current;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> subOutput = new LinkedList<Integer>();
            for (int i=0; i<size; i++) {
                current = queue.poll();
                subOutput.add(current.val);
                
                if (current.left!=null) {
                    queue.offer(current.left);
                }
                if (current.right!=null) {
                    queue.offer(current.right);
                }
            }
            output.add(subOutput);
        }
        return output;
    }
}

/*
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).

 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []
 

Constraints:

The number of nodes in the tree is in the range [0, 2000].
-1000 <= Node.val <= 1000
*/
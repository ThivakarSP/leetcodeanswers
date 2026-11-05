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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return find(root,targetSum,0);
    }

    boolean find(TreeNode node , int targetSum , int curr){
        if(node == null) return false;

        curr += node.val;

        if(node.left == null && node.right == null){
            return curr == targetSum;
        }

        return find(node.left,targetSum,curr) || find(node.right,targetSum,curr);
    }
}
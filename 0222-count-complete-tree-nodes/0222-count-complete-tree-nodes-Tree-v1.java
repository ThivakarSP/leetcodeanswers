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
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int left = lh(root);
        int right = rh(root);

        if(left == right){
            return (1 << left) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    int lh(TreeNode root){
        int h = 0;

        while(root != null){
            root = root.left;
            h++;
        }

        return h;
    }

    int rh(TreeNode root){
        int h = 0;

        while(root != null){
            root = root.right;
            h++;
        } 

        return h;
    }
}
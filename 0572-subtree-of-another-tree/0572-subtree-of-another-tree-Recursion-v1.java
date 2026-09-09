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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        TreeNode temp = find(root, subRoot);
        return temp!=null;
    }

    boolean isSame(TreeNode temp, TreeNode subRoot) {
        if (temp == null && subRoot == null) {
            return true;
        }

        if (temp == null || subRoot == null) {
            return false;
        }

        if(temp.val != subRoot.val){
            return false;
        }

        return isSame(temp.left, subRoot.left) && isSame(temp.right, subRoot.right);
    }

    TreeNode find(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return null;
        }

        if (root.val == subRoot.val && isSame(root,subRoot)) {
            return root;
        }

        TreeNode left = find(root.left, subRoot);

        if(left != null){
            return left;
        }

        return find(root.right, subRoot);
    }
}
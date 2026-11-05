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
    List<String> res;

    public List<String> binaryTreePaths(TreeNode root) {
        res = new ArrayList<>();
        find(root, "");
        return res;
    }

    void find(TreeNode node, String curr) {
        if (node == null)
            return;
        if (curr.isEmpty()) {
            curr += node.val;
        } else {
            curr += "->" + node.val;
        }
        if (node.left == null && node.right == null) {
            res.add(curr);
        }
        find(node.left, curr);
        find(node.right, curr);
    }
}
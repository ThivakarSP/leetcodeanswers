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
    List<String> paths = new ArrayList<>();
    public int sumRootToLeaf(TreeNode root) {
        find(root,"");
        int result = 0;
        for(String path : paths){
            result += Integer.parseInt(path,2);
        }
        return result;
    }

    void find(TreeNode node,String curr){
        if(node == null) return;

        curr = curr + String.valueOf(node.val);

        if(node.left == null && node.right == null){
            paths.add(curr);
        }

        find(node.left,curr);
        find(node.right,curr);
    }
}
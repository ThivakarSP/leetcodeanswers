class Solution {
    int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        find(root);
        return res;
    }

    int find(TreeNode node) {
        if (node == null) return 0;

        int left = Math.max(0, find(node.left));
        int right = Math.max(0, find(node.right));

        res = Math.max(res, node.val + left + right);

        return node.val + Math.max(left, right);
    }
}
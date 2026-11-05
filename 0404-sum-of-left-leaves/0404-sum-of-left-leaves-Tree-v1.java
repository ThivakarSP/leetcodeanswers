class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return find(root);
    }

    int find(TreeNode node) {
        if (node == null) return 0;

        int left = 0;

        if (node.left != null) {
            if (node.left.left == null && node.left.right == null) {
                left = node.left.val;
            } else {
                left = find(node.left);
            }
        }

        int right = find(node.right);

        return left + right;
    }
}
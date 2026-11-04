class Solution {
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }
        find(root);
        return ans;
    }

    int find(TreeNode node){
        if(node == null) return 0;
        int left = find(node.left);
        int right = find(node.right);
        ans = Math.max(ans,left+right);
        return Math.max(left,right) + 1;
    }
}
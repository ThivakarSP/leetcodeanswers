class Solution {

    class Pair {
        TreeNode node;
        long index;

        Pair(TreeNode node, long index) {
            this.node = node;
            this.index = index;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        long maxWidth = 0;
        while(!q.isEmpty()){
            int size = q.size();
            long first = 0;
            long last = 0;
            for(int i=0;i<size;i++){
                Pair p = q.poll();
                TreeNode node = p.node;
                long idx = p.index;

                if(i == 0){
                    first = idx;
                }

                if(i==size-1){
                    last = idx;
                }

                if(node.left != null){
                    q.offer(new Pair(node.left,idx * 2));
                }

                if(node.right != null){
                    q.offer(new Pair(node.right,idx * 2 + 1));
                }
            }

            maxWidth = Math.max(maxWidth,last-first+1);
        }

        return (int) maxWidth;
    }
}
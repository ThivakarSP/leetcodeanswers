class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        find(nums,used,new ArrayList<>());
        return res;
    }

    void find(int[] nums,boolean[] used,List<Integer> curr){
        if(curr.size() == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i] == true){
                continue;
            }

            used[i] = true;
            curr.add(nums[i]);
            find(nums,used,curr);
            used[i] = false;
            curr.remove(curr.size() - 1);
        }


    }
}
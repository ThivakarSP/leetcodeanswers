class Solution { 
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        find(nums,0,new ArrayList<>());
        return res;
    }

    void find(int[] nums,int i,ArrayList<Integer> curr){
        if(i == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        find(nums,i+1,curr);
        curr.remove(curr.size() - 1);
        find(nums,i+1,curr);
    }
}
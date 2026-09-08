class Solution {
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        find(candidates, target, 0, 0, new ArrayList<>());
        return res;
    }

    void find(int[] candidates, int target, int sum, int start, List<Integer> curr) {
        if (sum == target) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i = start;i < candidates.length ; i++){
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            }

            if(sum + candidates[i] > target){
                break;
            }

            curr.add(candidates[i]);
            find(candidates,target,sum+candidates[i],i+1,curr);
            curr.remove(curr.size() - 1);
        }
    }
}
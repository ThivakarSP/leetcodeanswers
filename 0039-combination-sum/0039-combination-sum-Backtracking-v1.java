class Solution {

    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        find(candidates,target,0,0,new ArrayList<>());
        return list;
    }

    void find(int[] candidates,int target,int val,int i,List<Integer> curr){

            if(val == target){
                list.add(new ArrayList<>(curr));
                return;
            }
        if(i==candidates.length || val > target){
            return;
        }

        curr.add(candidates[i]);
        find(candidates,target,val+candidates[i],i,curr);
        curr.remove(curr.size() - 1);
        find(candidates,target,val,i+1,curr);
    }
}   
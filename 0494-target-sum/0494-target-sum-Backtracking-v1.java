class Solution {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        find(nums,target,0,0);
        return count;
    }

    void find(int[] nums,int target,int index,int sum){
        if(index == nums.length){
            if(sum==target){
                count++;
            }
            return;
        }

        find(nums,target,index+1,sum-nums[index]);
        find(nums,target,index+1,sum+nums[index]);
        
    }
}
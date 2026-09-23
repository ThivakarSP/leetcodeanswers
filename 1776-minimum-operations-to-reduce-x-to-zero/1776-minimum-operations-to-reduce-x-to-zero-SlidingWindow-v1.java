class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;
        int n = nums.length;

        for(int num : nums){
            total += num;
        }

        int target = total - x;

        if(target == 0){
            return n;
        }

        if(target < 0){
            return -1;
        }

        int left = 0;
        int sum = 0;
        int maxlen = 0;

        for(int right=0;right<n;right++){
            sum += nums[right];

            while(sum > target && left <= right){
                sum -= nums[left];
                left++;
            }

            if(sum == target){
                maxlen = Math.max(maxlen,right-left+1);
            }
        }

        return maxlen == 0 ? -1 : n - maxlen;
    }
}
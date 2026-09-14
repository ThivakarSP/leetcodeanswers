class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int res = nums[0];
        int maxp = nums[0];
        int minp = nums[0];

        for(int i=1;i<n;i++){
            int num = nums[i];
            int omaxp = maxp;
            int ominp = minp;
            maxp = Math.max(num,Math.max(omaxp*num,ominp*num));
            minp = Math.min(num,Math.min(omaxp*num,ominp*num));
            res = Math.max(res,maxp);
        }


        return res;
        
    }
}
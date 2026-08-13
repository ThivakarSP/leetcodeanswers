class Solution {
    int l = -1,r=-1;
    public int[] searchRange(int[] nums, int target) {
        lowBound(nums,target,0,nums.length-1);
        if(l == -1) return new int[]{-1,-1};
        highBound(nums,target,0,nums.length-1);
        return new int[]{l,r};
    }

    public void lowBound(int[] nums,int x,int left , int right){
        while(left<=right){
            int mid = (left+right) / 2;

            if(nums[mid]==x){
                l=mid;
                right = mid -1;
            }
            else if(nums[mid]>x){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        
    }

    public void highBound(int[] nums,int x,int left , int right){
        while(left<=right){
            int mid = (left+right) / 2;

            if(nums[mid]==x){
                r=mid;
                left = mid +1;
            }
            else if(nums[mid]>x){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        
    }

}
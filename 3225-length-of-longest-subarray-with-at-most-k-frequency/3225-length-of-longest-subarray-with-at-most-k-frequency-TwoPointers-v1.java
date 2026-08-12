import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int maxLength = 0;
        int left = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int right = 0; right < nums.length; right++) {
            int curr = nums[right];
            map.put(curr,map.getOrDefault(curr,0) + 1);

            while(map.get(curr) > k){
                int leftNum = nums[left];
                map.put(leftNum,map.get(leftNum)-1);
                left++;
            }

            maxLength = Math.max(maxLength,right-left+1);
        }        
        
        return maxLength;
    }
}
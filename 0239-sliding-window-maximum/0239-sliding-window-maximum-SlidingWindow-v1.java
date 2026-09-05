class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1) return nums;
        
        int n = nums.length;
        int[] result = new int[n-k+1];

        Deque<Integer> deque = new ArrayDeque<>();
        int index = 0;

        for(int right = 0; right < n ;right++){
            while(!deque.isEmpty() && deque.peekFirst() <= right - k){
                deque.pollFirst();
            }

            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[right]){
                deque.pollLast();
            }

            deque.offerLast(right);

            if(right >= k-1){
                result[index++] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}                                               
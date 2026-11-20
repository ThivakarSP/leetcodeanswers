class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] arr = new int[n*(n + 1)/2];
        int idx = 0;


        for(int i=0;i<n;i++){
            int temp = 0;
            for(int j=i;j<n;j++){
                temp += nums[j];
                arr[idx++] = temp;
            }
        }

        Arrays.sort(arr);

        int result = 0;
        int mod = 1000000007;

        for(int i=left-1;i<right;i++){
            result = (result + arr[i]) % mod;
        }

        return result;
    }
}
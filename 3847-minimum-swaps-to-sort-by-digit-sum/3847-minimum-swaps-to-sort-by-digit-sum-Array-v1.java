class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;

        int[][] arr = new int[n][3];

        for(int i=0;i<n;i++){
            int num = nums[i];
            int sum = 0;

            while(num > 0){
                sum += num%10;
                num /= 10;
            }

            arr[i][0] = sum;
            arr[i][1] = nums[i];
            arr[i][2] = i;
        }

        Arrays.sort(arr , (a,b) -> {
            if(a[0] != b[0]){
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int swap = 0;
        boolean[] visited = new boolean[n];

        for(int i=0;i<n;i++){
            if(visited[i] || arr[i][2] == i){
                continue;
            }

            int j = arr[i][2];
            int count = 0;

            while(!visited[j]){
                visited[j] = true;
                count++;
                j = arr[j][2];
            }

            swap += count - 1;
        }

        return swap;

    }
}
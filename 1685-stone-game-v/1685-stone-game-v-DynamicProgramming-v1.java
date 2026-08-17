class Solution {
    int[][] dp;
    int[] prefix;
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        dp = new int[n][n];  
        prefix = new int[n+1];

        for(int i=0;i<n;i++){
            prefix[i+1] = prefix[i] + stoneValue[i];
        }

        for(int row[] : dp){
            Arrays.fill(row,-1);
        }  

        return solve(0,n-1); 
    }

    public int solve(int l , int r){
        if(l==r) return 0;

        if(dp[l][r] != -1) return dp[l][r];
        int best = 0;

        for(int k=l;k<r;k++){
            int left = sum(l,k);
            int right = sum(k+1,r);
            int score;
            if(left<right){
                score = solve(l,k) + left;
            }
            else if(left>right){
                score = solve(k+1,r) + right;
            }
            else{
                score = Math.max(solve(l,k),solve(k+1,r)) + left;
            }
            best = Math.max(best,score);
        }

        dp[l][r] = best;
        return best;
    }

    public int sum(int l,int r){
        return prefix[r+1] - prefix[l];
    }
}
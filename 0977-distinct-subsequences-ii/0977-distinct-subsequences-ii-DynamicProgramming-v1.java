class Solution {
    public int distinctSubseqII(String s) {
        int[] dp = new int[26];
        int MOD = 1000000007;

        for(char ch : s.toCharArray()){
            int total = 1;

            for(int x : dp){
                total = (total + x) % MOD;
            }

            dp[ch - 'a'] = total;
        }

        int total = 0;

        for(int x : dp){
            total = (total + x) % MOD;
        }

        return total;
    }
}
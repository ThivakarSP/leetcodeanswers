class Solution {
    public String minWindow(String s, String t) {
        int[] freqs = new int[128];
        int[] freqt = new int[128];

        for(char ch : t.toCharArray()){
            freqt[ch]++;
        }

        int n = s.length();
        int left = 0;
        int have = 0;
        int need = t.length();

        int minLen = Integer.MAX_VALUE;
        int start =0;

        for(int right=0;right<n;right++){
            char ch = s.charAt(right);
            freqs[ch]++;

            if(freqt[ch] > 0 && freqs[ch] <= freqt[ch]){
                have++;
            }

            while(have == need){
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start = left;
                }

                char Leftchar = s.charAt(left);
                freqs[Leftchar]--;
                if(freqt[Leftchar] > 0 && freqs[Leftchar] < freqt[Leftchar]){
                    have--;
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start+minLen);
    }
}
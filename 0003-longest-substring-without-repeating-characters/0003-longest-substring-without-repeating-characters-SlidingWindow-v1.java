class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        int left = 0;
        int n = s.length();
        if(n==0) return 0;
        map.put(s.charAt(0),1);
        int result = 1;

        for(int right = 1;right<n;right++){
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);

            while(map.get(s.charAt(right)) != 1){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }

            result = Math.max(right - left + 1,result);
        }

        return result;
    }
}
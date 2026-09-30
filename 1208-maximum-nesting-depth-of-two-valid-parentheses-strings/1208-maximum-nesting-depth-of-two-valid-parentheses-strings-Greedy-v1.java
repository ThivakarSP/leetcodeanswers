class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] arr = new int[n];
        int bal = 0;

        for (int i = 0; i < n; i++) {
            char ch = seq.charAt(i);

            if (ch == '(') {
                bal++;
                arr[i] = bal % 2;
            } else {
                arr[i] = bal % 2;
                bal--;
            }
        }

        return arr;
    }
}
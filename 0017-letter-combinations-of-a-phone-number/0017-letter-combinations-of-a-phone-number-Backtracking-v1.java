class Solution {
    String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return res;
        }

        find(digits, 0, "");
        return res;
    }

    void find(String digits, int i, String curr) {
        if (i == digits.length()) {
            res.add(curr);
            return;
        }

        String letters = map[digits.charAt(i) - '0'];

        for (int j = 0; j < letters.length(); j++) {
            find(digits, i + 1, curr + letters.charAt(j));
        }
    }
}
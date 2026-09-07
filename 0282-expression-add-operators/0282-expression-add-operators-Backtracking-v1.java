class Solution {

    List<String> res = new ArrayList<>();

    public List<String> addOperators(String num, int target) {
        find(num, target, 0, 0, 0, "");
        return res;
    }

    void find(String num, int target, int idx, long val, long prev, String curr) {
        if (idx == num.length()) {
            if (val == target) {
                res.add(curr);
            }
            return;
        }

        long tmp = 0;

        for (int i = idx; i < num.length(); i++) {

            if (i > idx && num.charAt(idx) == '0') {
                break;
            }

            tmp = tmp * 10 + (num.charAt(i) - '0');

            if (idx == 0) {
                find(num, target, i + 1, tmp, tmp, "" + tmp);
            } else {
                find(num, target, i + 1, val + tmp, tmp, curr + "+" + tmp);
                find(num, target, i + 1, val - tmp, -tmp, curr + "-" + tmp);
                find(num, target, i + 1, val - prev + prev * tmp, prev * tmp, curr + "*" + tmp);
            }
        }
    }
}
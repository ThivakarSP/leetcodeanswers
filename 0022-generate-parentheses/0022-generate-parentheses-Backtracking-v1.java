class Solution {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        find(n,0,0,"");
        return res;
    }

    void find(int n,int open,int close,String s){
        if(open == n && close == n){
            res.add(s);
            return;
        }

        if(open < n){
            find(n,open+1,close,s+"(");
        }
        if(close < open){
            find(n,open,close+1,s+")");
        }
    }
}
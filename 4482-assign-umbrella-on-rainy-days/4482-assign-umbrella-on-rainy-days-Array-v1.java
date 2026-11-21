class Solution {
    public String[] assignUmbrella(int[] rain) {
        int n = rain.length;
        String[] res = new String[n];
        int ac = 0;
        int bc = 0;

        for(int i=0;i<n-1;i++){
            if(rain[i] == 1 && rain[i+1] == 1){
                if(bc < ac){
                    res[i] = "Bob";
                    bc++;
                }
                else{
                    res[i] = "Alice";
                    ac++;
                }
            }
            else if(rain[i] == 1){
                res[i] = "Bob";
                bc++;
            }
            else{
                res[i] = "None";
            }
        }

        if(rain[n-1] == 1){
            res[n-1] = "Bob";
        }
        else{
            res[n-1] = "None";
        }

        return res;
    }
}
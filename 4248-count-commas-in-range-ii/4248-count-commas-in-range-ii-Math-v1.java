class Solution {
    public long countCommas(long n) {
        if(n<1000){
            return 0;
        }

        long count = 0;
        long commas = 1;
        long start = 1000; 
        while(start <= n){
            long end = start * 1000;
            if(end > n){
                count += (n-start+1) * commas;
                return count;
            }

            count += ((end - 1) - start + 1) * commas;
            commas++;
            start*=1000;
        }

        return count;
    }
}
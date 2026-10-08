class Solution {
    public long countCommas(long n) {
        
        long ans = 0;
        long i=1000;
        while(i<=n){
            ans+=n-i+1;
            i*=1000;
        }
        return ans;        
    }
}
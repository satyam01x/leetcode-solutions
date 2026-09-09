class Solution {
    public long countCommas(long n) {

        long res = 0;
        long start = 1000;
        long comma = 1;

        while( start <= n){
            
            long end = start * 1000 - 1;
            long last = Math.min( n , end);

            res += ( last - start + 1) * comma;

            start *= 1000;
            comma ++;
        }

        return res;
        
    }
}
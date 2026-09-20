class Solution {
    public int reverseDegree(String s) {
        
        int ans = 0;

        for(int i = 0; i < s.length(); i++){

            int reversed_idx = 26 - (s.charAt(i) - 'a');

            ans += reversed_idx * (i + 1);

        }

        return ans;
    }
}
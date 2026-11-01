class Solution {
    public int largestAltitude(int[] gain) {

        int start = 0;
        int altitude = 0;

        for (int i = 0; i < gain.length; i++){
            start += gain[i];
            altitude = Math.max(altitude , start);
        }

        return altitude;
    }
}
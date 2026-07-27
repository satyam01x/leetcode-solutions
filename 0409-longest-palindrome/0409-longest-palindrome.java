class Solution {
    public int longestPalindrome(String s) {
          int[] arr = new int[128];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }

        int length = 0;
        boolean hasOdd = false;

       for (int i = 0; i < arr.length; i++) {
            int count = arr[i];
        

            if (count % 2 == 0) {
                length += count;
            } else {
                length += count - 1;
                hasOdd = true;
            }
        }

        if (hasOdd) {
            length++;
        }

        return length;
    }
}
class Solution {
    public boolean isMonotonic(int[] nums) {
        //  nums = [1,2,2,3]
        //          0 1 2 3
        //          j i

        boolean inc = true;
        boolean dec = true;

        for(int i = 0; i < nums.length - 1; i++){

            if( nums[i] < nums[i + 1]){
                dec = false;
            }

            if( nums[i] > nums[i + 1]){
                inc = false;
            }
        }

        return inc || dec;
            
        
    }
}
class Solution {
    public int missingNumber(int[] nums) {
         int actual_sum = 0;
        int expected_sum = 0;

        for(int i = 0; i < nums.length; i++){
            actual_sum += nums[i];
        }

        for(int i = 0; i <= nums.length; i++){
            expected_sum += i;
        }

        return expected_sum - actual_sum;
    }
        
    }

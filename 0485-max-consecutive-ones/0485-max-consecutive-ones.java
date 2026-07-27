class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max =0;
          for(int i = 0; i<nums.length; i++){
        if(nums[i]==1){
            count += 1;

            max = Math.max(max, count);
            // math.max return max value between max and count
        }else{
            count = 0;
        }

        
    }
    return max;
}
}
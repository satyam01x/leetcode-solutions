class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = k-1;

        int sum = 0;
       
        for(int i = 0; i < k; i++){
            sum += nums[i];

        }

         int max_sum =  sum;

        while(right < nums.length - 1){
          
            sum = sum - nums[left];
            sum = sum + nums[right + 1];

            left++;
            right++;

            if(sum> max_sum){
                max_sum = sum;
            }

        }
        return (double) max_sum / k;
    }
}
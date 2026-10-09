class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();

        int prefix_sum = 0;
        int count = 0;
        // key = prefix sum , value = frequancy;
        // put 0 prefix sum of 1 frequancy in hashmap
        map.put(0 , 1);
        // iterate left to right and find prefix 
        for(int num : nums){
            prefix_sum += num;
            int needed = prefix_sum - k;
            // if needed is found in hashmap
            if(map.containsKey(needed)){
                count += map.get(needed);
            }
            // otherwise add prefix , frequancy
            map.put(prefix_sum , map.getOrDefault(prefix_sum , 0) + 1);
        }

        return count;
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums1){
            set.add(i);
        }

        HashSet<Integer> result = new HashSet<>();

        for(int i : nums2){
            if(set.contains(i)){
                result.add(i);
            }
        }

        int[] arr = new int [result.size()];

        int idx = 0;

        for(int i : result){
            arr[idx] = i;
            idx ++;
        }

        return arr;
    }
}
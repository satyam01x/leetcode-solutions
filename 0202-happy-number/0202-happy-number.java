class Solution {
    public boolean isHappy(int n) {

    HashSet<Integer> Set = new HashSet<>();

    while( n != 1){

        if(Set.contains(n)){
            return false;
        }

        Set.add(n);

        int sum = 0;

        while( n > 0){

        int digit = n % 10;
        sum += digit * digit;
        n = n / 10;

        }
        
        n = sum;

    }

    return true;

    }
}
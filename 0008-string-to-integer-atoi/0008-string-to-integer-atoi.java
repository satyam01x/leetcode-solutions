class Solution {
    public int myAtoi(String s) {

        //  ...sa25
        //   ...-42

        int i = 0;
        int sign = 1;
        long num = 0;
        
        //  1st case

        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }

        // 2nd case

        if(i < s.length()  && s.charAt(i) == '-'){

            sign = -1;
            i++;

        }else if(i < s.length() && s.charAt(i) == '+'){

            i++;
        }

        // 3rd case

        while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){

            int digit = s.charAt(i) - '0';

            //  checking overflow 
            // max = 2147483647
            // min = -2147483648

            if(sign == 1){
                if(num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > 7)){
                    return Integer.MAX_VALUE;
                }
            }
            else {
                if(num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > 8)){
                    return Integer.MIN_VALUE;
                }
            }

            num = num * 10 + digit;
            i++;
        } 

        return (int) (num * sign);
    }
}
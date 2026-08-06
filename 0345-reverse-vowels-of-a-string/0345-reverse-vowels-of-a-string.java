class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() -1;
        

        StringBuilder sb = new StringBuilder(s);

        while(left < right){

            if( !isVowel(sb.charAt(left))) {
                left++;
            }
           

            else if(!isVowel(sb.charAt(right))){

            right--;
            }

            else{
                char temp = sb.charAt(left);

                sb.setCharAt(left, sb.charAt(right));

                sb.setCharAt(right, temp);

                left++;
                right--;
            }

        }
        return sb.toString();
    }

    private boolean isVowel (char a){
        
        if (a == 'a' || a == 'A' ||
            a == 'e' || a == 'E' ||
            a == 'i' || a == 'I' ||
            a == 'o' || a == 'O' ||
            a == 'u' || a == 'U') {

    return true;
}

    return false;

    }
}
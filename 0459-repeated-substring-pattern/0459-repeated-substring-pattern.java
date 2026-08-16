class Solution {
    public boolean repeatedSubstringPattern(String s) {
        
       String substr;
       
        for(int i = 1; i<s.length(); i++){

            if(s.length() % i == 0){

                substr = s.substring(0, i);
                boolean match = true;
    
                for(int j = 0; j<s.length(); j++){
                    if(s.charAt(j) != substr.charAt(j%substr.length())){
                    match = false;
                    break;
                }
            
                }
                if(match){
                return true;
                }
            }
        }
        return false;

    }
}
class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        while( read < chars.length ){
            int count = 1;
            while(read< chars.length-1 && chars[read] == chars[read +1]){
                read++;
                count++;

            }
            chars[write] = chars [read];
            write++;
            
            if(count > 1){
                String s = String.valueOf(count);
                for(int i = 0; i < s.length() ; i++){
                    chars[write] = s.charAt(i);
                    write++;
                }

            }
            read ++;
        }
        return write;
    }
}


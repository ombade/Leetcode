class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        int cnt =0;
        int flg =0;
        for(int i = n ; i>= 0 ; i--){
            if(s.charAt(i) == ' ' & flg==1){
                return cnt;
            }
            else {
                if(Character.isAlphabetic(s.charAt(i)))
                {
                    cnt++;
                flg =1;
                }
                
            }

        }
        return cnt;
    }
}
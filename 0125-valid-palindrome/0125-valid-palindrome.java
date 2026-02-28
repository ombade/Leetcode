class Solution {
   
    public boolean isPalindrome(String s) {
        if(s.length() == 1)return true;
        // String str = preprocess(s);
        // String s = "this is my stri I helo w";
        // String result = s.replaceAll("\\s+", "").toLowerCase();
        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0; 
        int end =result.length()-1;
        while(start < end)
        {
            if(result.charAt(start) == result.charAt(end))
            {
                start++;
                end--;

            }
            else
            {
                return false;
            }
        }
        return true ;
        
    }
}
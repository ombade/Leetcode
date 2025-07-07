class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        if (s.length() == 0)
            return true;
        if (t.length() == 0)
            return false;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j))
                j++;
                   if (j == s.length()) {  // Check here to avoid index out of bounds
                    return true;
                }
        }
        
        return false;
    }
}
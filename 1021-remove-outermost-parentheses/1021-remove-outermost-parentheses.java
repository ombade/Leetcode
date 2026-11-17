class Solution {
    public String removeOuterParentheses(String s) {
        int cnt = 0;
        String ans = "";
        for(char ch : s.toCharArray())
        {
            if(ch == '(')
            {
                if(cnt != 0) ans = ans+ch;
                cnt++;
            }
            else
            {cnt--;
                if(cnt != 0) ans = ans+ch;
                
            }
        }
        return ans;
    }
}
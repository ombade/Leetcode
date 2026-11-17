class Solution {
    public int maxDepth(String s) {
       int maxcnt = 0;
       int cnt = 0;
       for(char c : s.toCharArray())
       {

        if(c == '(')
        {cnt++;
           maxcnt= Math.max(cnt ,maxcnt);
           
        }
        else if (c == ')')
        {
            cnt--;
        }
        else
        {
            cnt++;
            cnt--;
        }

       } 
       return maxcnt;
    }
}
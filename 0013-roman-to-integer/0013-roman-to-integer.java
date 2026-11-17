class Solution {
    public int chartoint(char ch)
    {
        if(ch == 'I')return 1;
        else if(ch == 'V')return 5;
        else if(ch == 'X')return 10;
        else if(ch == 'L')return 50;
        else if(ch == 'C')return 100;
        else if(ch == 'D')return 500;
        else{
            return 1000;
        }

    }
    public int romanToInt(String s) {
        int ans = 0;
        int prev = 99999;
        for (char ch : s.toCharArray())
        {
            int digit = chartoint(ch);
            if (prev < digit) digit = digit - (2*prev);
            ans = ans+digit;
            prev = digit;
        }
        return ans;
    }
}
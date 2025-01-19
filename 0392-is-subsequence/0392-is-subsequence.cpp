class Solution {
public:
    bool isSubsequence(string s, string t) {
        int i =0 ;
        int j =0 ;
        while(i != s.length() && j != t.length())
        {
            if(s[i] == t[j]) i++;
            j++;
        }
        if(i == s.length())
        {
            return true ;
        }
        return false;
        
        /*
        \U0001f4da Intuition
To check if one string is a subsequence of another, we can scan the second string and try to match all characters of the first string in order. If we can match all characters, it's a subsequence! ✅

\U0001f50e Approach
Use two pointers to iterate through both strings.
If characters match, move the pointer in the first string.
Always move the pointer in the second string.
If we reach the end of the first string, it's a subsequence! \U0001f3af
⏳ Complexity
Time Complexity: ( O(m + n) )
( m ) = length of s, ( n ) = length of t
Space Complexity: ( O(1) )

        */
    }
};
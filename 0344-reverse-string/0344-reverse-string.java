
//Reverse using the Recusresuon 
// for par
// class Solution {
//       public void solve(char[] s, int start , int end ) {
//       if( start >= end )
//       {
// return ;
//       } 
      
      
//       char temp = s[start];
//       s[start] = s[end];
//       s[end] = temp;
//       solve(s , start+1, end-1);
//       }

//     public void reverseString(char[] s) {
//         solve(s , 0 , s.length -1);
//     }
// }
class Solution {
    public void reverseString(char[] s) {
       int n = s.length;
       int i = n-1;
       int j = 0;
       while(j<i){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j++;
            i--;
        }
    }
}
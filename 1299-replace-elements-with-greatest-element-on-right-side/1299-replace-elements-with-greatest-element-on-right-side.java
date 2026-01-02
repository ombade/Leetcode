class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        
        int gr = -1;
        for (int i = n-1 ; i>= 0 ; i--)
        {
        
            ans[i] = gr;
            gr = Math.max(gr, arr[i]);

        }
        return ans;
    }
}
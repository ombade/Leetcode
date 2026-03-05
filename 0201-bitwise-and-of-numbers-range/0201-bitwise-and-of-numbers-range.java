class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int shift = 0;
        while(m != n)
        {
            m = m >> 1;
            n= n >> 1;
            shift++;
        }
        return m << shift;
        // int result = left;
        // for(int i = left+1 ; i<= right ; i++)
        // {
        //     result = result & i;
        //     if(result == 0) break;
        // }
        // return result;
        // int shift =0;
        // while(m < n)
        // {
        //     m >>= 1;
        //     n >>= 1;
        //     shift++;
        // }
        // return m << shift;
    }
}
class Solution {
    public int[] countBits(int n) {
        // ArrayList<Integer> ans = new ArrayList<>();
        int[] ans = new int[n+1];
        for(int i =0 ;i< n+1 ; i++)
        {int cnt=0;
        int num = i;
        while(num != 0)
        {
            num = num & (num-1);
            cnt++;
        }
        ans[i]= cnt;


        }
        return ans;
        
    }
}
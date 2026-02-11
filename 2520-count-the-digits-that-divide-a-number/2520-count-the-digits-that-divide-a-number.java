class Solution {
    public int countDigits(int num) {
        List<Integer> li = new ArrayList<>();
        int n2 = num;
        while(n2 > 0)
        {
         int digit = n2%10;
            li.add(digit);
            n2 = n2/10;

        }
        int cnt =0;
        for(int i =0 ; i< li.size() ; i++)
        {
            if(num % li.get(i) == 0)cnt++;
        }

        return cnt;
    }
}
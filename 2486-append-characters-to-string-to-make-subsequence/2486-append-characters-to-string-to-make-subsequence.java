class Solution {
    public int appendCharacters(String s, String t) {
        int sstart = 0;
        int send = s.length();
        int tstart =0;
        int tend = t.length();
        int  j =0;
        int i =0;
        while(i < send && j < tend)
        {
            if(s.charAt(i) == t.charAt(j))
            {i++;
            j++;}
            else{
                i++;
            }
        }
        return Math.abs(tend - j);
        
    }
}
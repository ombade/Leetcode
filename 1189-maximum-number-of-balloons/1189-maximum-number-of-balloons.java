class Solution {
    public int maxNumberOfBalloons(String text) {
       Map<Character ,Integer> feq = new HashMap<>();
       for(char c : text.toCharArray())
       {
        if(c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n')
        {
            feq.put(c , feq.getOrDefault(c,0)+1);
        }
       } 
       int x = Math.min(feq.getOrDefault('b', 0),
       (Math.min(feq.getOrDefault('a', 0),feq.getOrDefault('n', 0))));
       int xx = Math.min(feq.getOrDefault('l', 0),feq.getOrDefault('o', 0 ));
       return Math.min(x , xx/2);
    }
}
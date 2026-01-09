class Solution {
    public List<List<String>> wordSquares(String[] words) {
        String[] s = words.clone(); // Store input midway
        Arrays.sort(s);
        List<List<String>> result = new ArrayList<>();
        int n = s.length;
        
        // Try all combinations of 4 distinct words
        for (int a = 0; a < n; a++) {
            for (int b = 0; b < n; b++) {
                // Constraint 1: top[0] == left[0]
                if (a != b && s[a].charAt(0) == s[b].charAt(0)) {
                    for (int c = 0; c < n; c++) {
                        // Constraint 2: top[3] == right[0]
                        if (c != a && c != b && 
                            s[a].charAt(3) == s[c].charAt(0)) {
                            for (int d = 0; d < n; d++) {
                                // Constraint 3 & 4: bottom constraints
                                if (d != a && d != b && d != c && 
                                    s[d].charAt(0) == s[b].charAt(3) && 
                                    s[d].charAt(3) == s[c].charAt(3)) {
                                    result.add(Arrays.asList(s[a], s[b], 
                                                            s[c], s[d]));
                                }
                            }
                        }
                    }
                }
            }
        }
        return result;
    }
}
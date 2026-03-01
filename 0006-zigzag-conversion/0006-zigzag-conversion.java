class Solution {
    public String convert(String s, int numRows) {

        if(numRows == 1)return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i =0 ; i< numRows;i++)
        {
            rows[i] = new StringBuilder();

        }
        int currentrow = 0;
        boolean goingDown = false;
        for(char c :s.toCharArray())
        {
            rows[currentrow].append(c);
            if(currentrow == 0 || currentrow == numRows -1 ) goingDown = !goingDown;

            currentrow += goingDown ? 1:-1;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row :rows){
            result.append(row);
        }
        return result.toString();

        
    }
}
class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0 ; i< row ; i++)
        {
            for(int j = i+1 ; j< col ; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] =temp;
            }
        }
        for(int i = 0 ; i < row ; i++)
        {
            int right = 0; int left = row -1;
            while(right < left)
            {
                 int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] =temp; 
                right++;
                left--;
            }
        }
        
    }
}
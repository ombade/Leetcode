class Solution {
    public static void markcol(int n , int[][] matrix)
    {
         int row = matrix.length;
        int col = matrix[0].length;
     for (int i = 0; i < row; i++) {
    if (matrix[i][n] != 0)
        matrix[i][n] = -999999;
}

    }
    public static void markrow(int n , int[][] matrix)
    {
         int row = matrix.length;
        int col = matrix[0].length;
        for (int j = 0; j < col; j++) {
        if (matrix[n][j] != 0)
        matrix[n][j] = -999999;
}
    }
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
//         for(int i = 0 ; i < row ; i++)
//         {
//             for(int j = 0 ; j< col ; j++)
//             {
//                 if(matrix[i][j] == 0)
//                 {
//                     markrow(i,matrix);
//                     markcol(j,matrix);
//                 }
//             }
//         }
//          for(int i = 0 ; i < row ; i++)
//         {
//             for(int j = 0 ; j< col ; j++)
//             {
//                 if(matrix[i][j] == -999999)
//                 {
// matrix[i][j] = 0;
    //             }
    //         }}
        

        // better approch 
        int rows[] = new int[row];
        int colums [] = new int[col];
        for(int i = 0 ; i< row; i++)
        {
            for(int j = 0 ; j< col ; j++)
            {
                if(matrix[i][j] == 0)
                {
                    rows[i] = 1;
                    colums[j] = 1;
                }
            }
        }


        for(int i = 0 ; i< row; i++)
        {
            for(int j = 0 ; j< col ; j++)
            {
                if(rows[i] == 1 || colums[j]== 1)
                {
                   matrix[i][j] = 0;
                }
            }
        }

    }

}
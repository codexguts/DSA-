class Solution {
    public void setZeroes(int[][] matrix) {
        int rows= matrix.length;

        if(rows ==0){
            return;
        }
        int cols= matrix[0].length;
        boolean[] zerorows = new boolean[rows];
        boolean[] zerocols = new boolean[cols]; 

        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                if(matrix[row][col] == 0){
                    zerorows[row] = true;
                    zerocols[col] = true;
                }
            }
        }

        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                if( zerorows[row] || zerocols[col]){
                    matrix[row][col] = 0;
                }
            }
        }
    }
}
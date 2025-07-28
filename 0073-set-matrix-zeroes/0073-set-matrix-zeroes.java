class Solution {
    public void setZeroes(int[][] matrix) {

        HashSet<Integer> set_i = new HashSet<Integer>();
        HashSet<Integer> set_j = new HashSet<Integer>();

        for(int i=0;i<matrix.length*matrix[0].length;i++){
            int row=i/matrix[0].length;
            int col=i % matrix[0].length;
            if(matrix[row][col]==0){
                    set_i.add(row);
                    set_j.add(col);
                }

        }


        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(matrix[i][j]==0){
        //             set_i.add(i);
        //             set_j.add(j);
        //         }
        //     }
        // }
        
        
        for(int k=0;k<matrix.length;k++){
            if(set_i.contains(k)){
                for(int l=0;l<matrix[k].length;l++){
                    matrix[k][l]=0;
                }
            }
        }

        for(int k=0;k<matrix[0].length;k++){
            if(set_j.contains(k)){
                for(int l=0;l<matrix.length;l++){
                    matrix[l][k]=0;
                }
            }

        }

        
    }
}
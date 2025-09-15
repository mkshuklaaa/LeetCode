class Solution {
    public boolean isValid(char[][] board,int row,int col,int num){
        // col
        for(int j=0;j<9;j++){
            if(board[row][j]==num) return false;
        }

        //row
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }

        int big_row = row/3;
        int big_col = col/3;

        int start_row = big_row*3;
        int start_col = big_col*3;

       //big matrx
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(board[start_row][start_col++]==num) return false;
        }
        start_row++;
        start_col = big_col*3;
       }
       return true;    
    }
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
               char num = board[i][j];
               board[i][j]='.';
               if(!isValid(board,i,j,num)) return false;
               board[i][j] = num;
            }
        }return true;
    }
}
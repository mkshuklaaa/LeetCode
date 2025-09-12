class Solution {
    public boolean isSafe(char[][] board,int row,int col,int n){
        for(int i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }

        for(int j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }

        int i = row;
        int j= col;
        while(i<n && j<n){
            if(board[i++][j++]=='Q') return false;
        }

        i = row;
        j= col;
        while(i>=0 && j>=0){
            if(board[i--][j--]=='Q') return false;
        }

        i = row;
        j= col;
        while(i>=0 && j<n){
            if(board[i--][j++]=='Q') return false;
        }

        i = row;
        j= col;
        while(i<n && j>=0){
            if(board[i++][j--]=='Q') return false;
        }

        return true;
    }

    public void helper(char[][] board,List<List<String>> ans,int n,int row){
        if(row==n){
            List<String> l = new ArrayList<>();
            for(int i=0;i<n;i++){
                String str = "";
                for(int j=0;j<n;j++){
                    str+=board[i][j];
                }l.add(str);
            } 
            ans.add(l);
            return;
        }

        for(int j=0;j<n;j++){
            if(isSafe(board,row,j,n)){
                board[row][j] = 'Q';
                helper(board,ans,n,row+1);
                board[row][j] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) board[i][j]='.';
        }
        helper(board,ans,n,0);
        return ans;
    }
}
class Solution {
    public int max(int[][] mat,int r,int c,int[][] dp){
        if(r==mat.length-1 && c==mat[0].length-1) return mat[r][c];
        if(r>=mat.length || c>=mat[0].length) return Integer.MAX_VALUE;
        if(r<0 || c<0) return 0;
        if(dp[r][c]!=-1) return dp[r][c];
        int d = max(mat,r+1,c,dp);
        int dr = max(mat,r,c+1,dp);
        return dp[r][c] = mat[r][c] + Math.min(d, dr);
    }
    public int minPathSum(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int[][] dp = new int[r+1][c+1];
        for(int i=0;i<=r;i++){
            for(int j=0;j<=c;j++) dp[i][j]=-1;
        }
        return max(mat,0,0,dp);
        
    }
}
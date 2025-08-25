class Solution {
    public int minPathSum(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int[][] dp = new int[r][c];
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==0 && j==0) dp[i][j] = mat[i][j];
                else dp[i][j] = mat[i][j] + Math.min((i-1>=0)?dp[i-1][j]:Integer.MAX_VALUE,(j-1>=0)?dp[i][j-1]:Integer.MAX_VALUE);
            }
        }
        return dp[r-1][c-1];
    }
}
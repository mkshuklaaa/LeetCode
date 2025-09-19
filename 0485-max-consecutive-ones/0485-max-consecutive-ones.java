class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        int l=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                l=r+1;
            }
            max = Math.max(max,r-l+1);
        }return max;
        
    }
}
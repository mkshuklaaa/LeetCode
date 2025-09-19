class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int n = nums.length;

        for(int r=0;r<n;r++){
            if(nums[r]!=0){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
            }
        }
        
    }
}
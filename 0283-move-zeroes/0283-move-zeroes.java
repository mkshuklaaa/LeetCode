class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++) if(nums[i]==0) count++;

        for(int j=0;j<count;j++){
            for(int i=1;i<n;i++){
                if(nums[i-1]==0){
                    int temp = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1] = temp;
                }
            }
        }
        
        
    }
}
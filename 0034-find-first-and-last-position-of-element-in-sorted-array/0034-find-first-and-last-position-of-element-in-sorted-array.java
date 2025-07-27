class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0]= -1;
        res[1]= -1;
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){ 
                res[x++]=i;
                break;
                }
        }

        if(res[0]==-1) return res;
        for(int i=nums.length-1;i>=res[0];i--){
                if(nums[i]==target){ 
                res[x++]=i;
                break;
                }
        }
        return res;
        
    }
}
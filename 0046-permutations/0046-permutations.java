class Solution {
    public void printP(int[] nums,List<List<Integer>> ans,int idx){
        if(idx==nums.length-1){
            List<Integer> arr = new ArrayList<>();
            for(int i=0;i<nums.length;i++) arr.add(nums[i]);
            ans.add(arr);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
            printP(nums,ans,idx+1);
            nums[idx] = nums[i];
            nums[i]=temp;            
        }
        

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        printP(nums,ans,0);
        return ans;
    }
}
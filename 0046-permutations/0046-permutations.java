class Solution {
    public void printP(int[] nums,List<List<Integer>> ans,List<Integer> arr,boolean[] isVisited){
        if(arr.size()==nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int i=0;i<arr.size();i++) temp.add(arr.get(i));
            ans.add(temp);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!isVisited[i]){
                arr.add(nums[i]);
                isVisited[i] = true;        
                printP(nums,ans,arr,isVisited);
                isVisited[i] = false;
                arr.remove(arr.size()-1);
            }
        }
        

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        boolean[] isVisited = new boolean[nums.length];
        printP(nums,ans,arr,isVisited);
        return ans;
    }
}
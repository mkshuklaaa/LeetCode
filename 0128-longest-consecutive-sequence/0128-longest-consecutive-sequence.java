class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;

        for(int i=0;i<nums.length;i++) set.add(nums[i]);

        for(int num:set){
            if(!set.contains(num-1)){
                int currNum = num;
                int streak = 1;
                while(set.contains(num+1)){
                    num++;
                    streak++;
                }res=Math.max(res,streak);
            }
        }return res;
        
    }
}
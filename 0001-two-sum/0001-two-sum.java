class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];

        
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            if(map.containsKey(target-nums[i])){
                res[0] = i;
                res[1] = map.get(target-nums[i]);
                break;
            }else{
                map.put(nums[i],i);
            }
        }return res;        
    }
}
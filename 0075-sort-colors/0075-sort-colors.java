class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])) map.put(nums[i],map.get(nums[i])+1);
            else map.put(nums[i],1);
        }
        int i = 0;
        for(int key: map.keySet()){
            
            while(map.get(key)!=0){
                nums[i++] = key;
                map.put(key,map.get(key)-1);
            }
        }
    }
}
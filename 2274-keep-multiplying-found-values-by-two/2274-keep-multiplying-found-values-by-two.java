class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums) set.add(num);
        int n = original;

        while(set.contains(n)) n*=2;

        return n;
    }
}
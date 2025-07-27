class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] res = new int[nums1.length+nums2.length];
        int n = res.length;
        for(int i=0;i<nums1.length;i++) res[i] = nums1[i];
        int x=0;
        for(int i=nums1.length;i<n;i++) res[i] = nums2[x++];
        Arrays.sort(res);
        double median;        

        if(n%2==0){
            double y = res[(n/2)-1]+res[n/2];
            median = y/2;
        }else{
            double y = res[((n+1)/2)-1];
            median = y;
        }
        return median;
    }
}
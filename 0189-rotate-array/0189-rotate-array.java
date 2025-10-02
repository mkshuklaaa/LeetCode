class Solution {
    public void reverse(int arr[],int i,int j){
        while(j>i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
    }
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k = k%n;
        k=n-k;                
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);
    }
}
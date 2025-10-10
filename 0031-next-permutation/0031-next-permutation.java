class Solution {
    
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;
        int count =1;
        
        for(int i=n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                pivot = i-1;
                break;
            }else count++;
        }
        
        if(count==arr.length) Arrays.sort(arr);
        else{
            for(int i=n-1;i>0;i--){
                if(arr[i]>arr[pivot]){
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                    break;
                }
            }
        
            for(int j=pivot+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[j]>arr[k]){
                        int temp = arr[j];
                        arr[j] = arr[k];
                        arr[k] = temp;
                    }
                }
            }
        }
    }
}
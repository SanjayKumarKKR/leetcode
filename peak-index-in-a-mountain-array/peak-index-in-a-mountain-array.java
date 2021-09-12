class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st =0, end = arr.length-1;
        while(st<=end){
            int mid = st+((end-st)/2);
            // if(mid==0 || mid==arr.length-1){return }
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1] ){
                return mid;
            }else if(arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1]){
                st = mid;
            }else{
                end = mid;
            }
        }
        
        return st;
    }
}
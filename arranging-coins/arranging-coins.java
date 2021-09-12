class Solution {
    public int arrangeCoins(int n) {
        long st = 0 , end = n;
        while(st<=end){
            long mid = st+((end-st)/2);
            long sum = (mid*(mid+1))/2;
            if(sum==n){return (int)mid;}
            // System.out.println(mid +" "+ st+" "+end);
            if(sum>n){
                end = mid-1;
            }else{
                st = mid+1;
            }
        }
        
        return (int)end;
        
    }
}
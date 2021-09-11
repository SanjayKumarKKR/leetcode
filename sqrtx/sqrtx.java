class Solution {
    public int mySqrt(int x) {
        if(x==0){return 0;}
        int st = 1, end = x;
        int res = -1;
        while(st<=end){
            int mid = st+((end-st)/2);
            // System.out.println(mid);
            if((mid)==(x/mid)){
                return mid;
            }else if((mid)<(x/mid)){
                res = mid;
                st = mid+1;
            }else{
                end = mid-1;
            }
        }
        
        
        return res;
    }
}
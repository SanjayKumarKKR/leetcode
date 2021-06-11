class Solution {
    int res;
    public int fib(int n) {
        int a [] = new int[n+1];
        return f(n,a);
        
    }
    int f (int n,int a[]){
        if(a[n]== 0){
            if(n==0 || n==1){
                return n;
            }else{
                res = f(n-1,a)+f(n-2,a);
            }
            a[n]=res;
        }
        
        return a[n];
    }
    
}
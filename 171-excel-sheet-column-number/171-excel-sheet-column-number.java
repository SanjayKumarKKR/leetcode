class Solution {
    public int titleToNumber(String columnTitle) {
        char arr[] = columnTitle.toCharArray();
        int res =0;
        for(int i=0;i<arr.length;i++){
            res*=26;
            res+=arr[i]-'A'+1;
        }
        return res;
    }
}
class Solution {
    public int strStr(String haystack, String needle) {
        char hay[] = haystack.toCharArray();
        char need[] = needle.toCharArray();
        if(needle.equals("")) return 0;
        if(haystack.equals(needle)) return 0;
        int k=0;
        for(int i=0;i<hay.length;i++){
            if(hay[i]==need[k]){
                int t=i;
                while(hay[t]==need[k]){
                    if(k==need.length-1){
                        return i;
                    }
                    k++;
                    t++;
                    if(k>need.length-1 || t>hay.length-1){
                        return -1;
                    }
                }
                k=0;
            }
        }
        
        return -1;
    }
}
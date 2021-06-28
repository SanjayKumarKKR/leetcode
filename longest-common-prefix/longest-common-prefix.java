class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix= strs[0];
        int i=1;
        while(i!=strs.length && prefix!=""){
            System.out.print(prefix +" "+ strs[i]);
            char arr_prefix [] = prefix.toCharArray();
            char arr_strs[] = strs[i].toCharArray();
            prefix="";
            for(int j=0;j<arr_prefix.length && j<arr_strs.length ;j++){
                if(arr_prefix[j]==arr_strs[j]){
                    prefix=prefix+arr_prefix[j];
                }else{
                    break;
                }
            }
            i++;
        }
        
        return prefix;
    }
}
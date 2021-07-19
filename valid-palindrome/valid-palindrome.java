class Solution {
    public boolean isPalindrome(String s) {
        s= s.toLowerCase();
        s=s.replace(" ","");
        int st=0;
        int end = s.length()-1;
        while(st<end){
            while(st!=s.length() && !(s.charAt(st)>='a' && s.charAt(st)<='z' || s.charAt(st)>='A' && s.charAt(st)<='Z' || s.charAt(st)>='0' && s.charAt(st)<='9')){
                st++;
            }
            while(end!=0 && !(s.charAt(end)>='a' && s.charAt(end)<='z' || s.charAt(end)>='A' && s.charAt(end)<='Z' || s.charAt(end)>='0' && s.charAt(end)<='9')){
                end--;
            }
            if(st>end){
                return true;
            }
            // System.out.println(s.charAt(st) +" "+s.charAt(end));
            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}
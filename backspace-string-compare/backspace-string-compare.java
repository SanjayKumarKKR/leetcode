class Solution {
    public boolean backspaceCompare(String s, String t) {
        String s1="",t1="";
        int k=0;
        for(int i=s.length()-1;i>=0;i--){
            // System.out.println(s.charAt(i));
            if(s.charAt(i)=='#'){
                    k++;
            }else{
                if(k==0)
                s1=s1+s.charAt(i);
                if(k>0)
                k--;
            }
        }
        k=0;
        for(int i=t.length()-1;i>=0;i--){
            if(t.charAt(i)=='#'){
                k++;
            }else{
                 if(k==0)
                t1=t1+t.charAt(i);
                if(k>0)
                k--;
            }
        }
        System.out.println(s1+" "+t1);
        return s1.equals(t1);
    }
}
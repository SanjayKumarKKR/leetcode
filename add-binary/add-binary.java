class Solution {
    public String addBinary(String a, String b) {
        int carry =0;
        int l1 = a.length()-1;
        int l2 = b.length()-1;
        String ans ="";
        while(l1!=-1 && l2!=-1){
            int a1 = Integer.parseInt(a.charAt(l1)+"");
            int b1 = Integer.parseInt(b.charAt(l2)+"");
            int num = a1 + b1 + carry;
            if(num==0){
                ans = "0"+ans;
                carry=0;
            }else if(num==1){
                ans = "1"+ans;
                carry=0;
            }else if(num==2){
                ans = "0"+ans;
                carry=1;
            }else{
                ans = "1"+ans;
                carry=1;
            }
            l1--;
            l2--;
        }
        while(l1!=-1){
            int a1 = Integer.parseInt(a.charAt(l1)+"");
            int num = a1 + carry;
            if(num==0){
                ans = "0"+ans;
                carry=0;
            }else if(num==1){
                ans = "1"+ans;
                carry=0;
            }else if(num==2){
                ans = "0"+ans;
                carry=1;
            }else{
                ans = "1"+ans;
                carry=1;
            }
            l1--;
        }
        while(l2!=-1){
            int a1 = Integer.parseInt(b.charAt(l2)+"");
            int num = a1 + carry;
            if(num==0){
                ans = "0"+ans;
                carry=0;
            }else if(num==1){
                ans = "1"+ans;
                carry=0;
            }else if(num==2){
                ans = "0"+ans;
                carry=1;
            }else{
                ans = "1"+ans;
                carry=1;
            }
            l2--;
        }
        
        if(carry!=0){
            ans="1"+ans;
        }
            
        return ans;
    }
}
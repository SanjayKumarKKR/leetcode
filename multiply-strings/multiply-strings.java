class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }
        char c1 [] = num1.toCharArray();
        char c2 [] = num2.toCharArray();
        int last1 =c1.length-1;
        int last2 = c2.length-1;
        int carry=0;
        String ans="";
        String answer="";
        int l=0;
        for(int i=c1.length-1;i>=0;i--){
            for(int j=c2.length-1;j>=0;j--){
                int l1 = c1[i]-'0';
                int l2 = c2[j]-'0';
                int num = (l1*l2)+carry;
                carry= num/10;
                ans=(num%10)+ans;
            }
            if(carry!=0)
            ans = carry +ans;
            carry=0;
            for(int k=0;k<l;k++){
                ans=ans+"0";
            }
            l++;
            // System.out.println(ans);
            answer = add(answer,ans);
            ans="";
        }
        
        return answer;
    }
    
    
    String add(String num1 , String num2){
        char c1 [] = num1.toCharArray();
        char c2 [] = num2.toCharArray();
        int last1 =c1.length-1;
        int last2 = c2.length-1;
        String ans ="";
        int carry=0;
        while(last1!=-1 && last2!=-1){
            int l1 = c1[last1]-'0';
            int l2 = c2[last2]-'0';
            int num = (l1+l2) + carry;
            carry = num/10;
            ans =(num%10) + ans ;
            System.out.println(num);
            last1--;
            last2--;
        }
        
        while(last1!=-1){
            int l1 = c1[last1]-'0';
            int num = l1 + carry;
            carry = num/10;
            ans =(num%10) + ans;
            last1--;
        }
        while(last2!=-1){
            int l2 = c2[last2]-'0';
            int num = l2 + carry;
            carry = num/10;
            ans =(num%10) + ans;
            last2--;
        }
        if(carry!=0){
            ans = carry  + ans;
        }
        return ans;
    }
}
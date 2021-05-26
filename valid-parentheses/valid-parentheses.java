class Solution {
    public boolean isValid(String st) {
        char arr[]=st.toCharArray();
        Stack<Character> s = new Stack<Character>();
        // System.out.println(s);
        // s.pop();
        // s.pop();
        for(int i=0;i<st.length();i++){
            // System.out.println(s+" "+st+" "+arr[i]);
            if(arr[i]=='(' || arr[i]=='{' || arr[i]=='['){
                // System.out.println(s+" "+st+" "+arr[i]);
                s.push(arr[i]);
            }else if(s.isEmpty()==false && (arr[i]==')' || arr[i]=='}' || arr[i]==']')){
                if(s.peek()=='(' && arr[i]==')' || s.peek()=='{' && arr[i]=='}' || s.peek()=='[' && arr[i]==']'){
                    // System.out.println(s+" "+st+" "+arr[i]);
                    s.pop();
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
         // System.out.println(s);
        
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
        
        
    }
}
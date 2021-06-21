class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> output =new LinkedList<>();
        if(digits==null || digits.length()==0){return output;}
        output.add("");
        String [] mapping = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        
        for(int i=0;i<digits.length();i++){
            int num =Character.getNumericValue(digits.charAt(i));
            while(output.peek().length()==i){
                String permute = output.remove();
                for(char c : mapping[num].toCharArray()){
                    output.add(permute+c);
                }
            }
        }
        
        return output;
    }
}
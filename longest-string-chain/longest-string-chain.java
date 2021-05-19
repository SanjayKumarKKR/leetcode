class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b) -> a.length()-b.length());
        int  res=0;
        HashMap<String, Integer> memo =new HashMap<>();
        for(int i=0;i<words.length;i++){
            String word = words[i];
            memo.put(word,1);
            for(int j=0;j<word.length();j++){
                StringBuilder sb =new StringBuilder(word);
                String next = sb.deleteCharAt(j).toString();
                if(memo.containsKey(next)){
                    memo.put(word,Math.max(memo.get(word),memo.get(next)+1));
                }
            }
            
            res= Math.max(memo.get(word),res);
            
        }
        
        return res;
    }
}
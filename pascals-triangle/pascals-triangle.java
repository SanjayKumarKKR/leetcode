class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> list =new ArrayList<>();
        List<List<Integer>> ans =new ArrayList<>();
        list.add(1);
        ans.add(list);
        int i=0;
        while(numRows!=1){
            // System.out.println(ans);
            list =new ArrayList<>();
            list.add(1);
            List<Integer> old = ans.get(i++);
            // System.out.println(old);
            for(int j=1;j<old.size();j++){
                // System.out.println(ans);
                list.add(old.get(j-1)+old.get(j));
            }
            // System.out.println(ans);
            list.add(1);
            ans.add(list);
            numRows--;
        }
        
        return ans;
        
    }
}
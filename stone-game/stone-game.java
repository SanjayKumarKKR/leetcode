class Solution {
    public boolean stoneGame(int[] piles) {
        
        int alex=0;
        int lee=0;
        int start=0;
        int end=piles.length-1;
        while(start<end){
            if(piles[start]>piles[end]){
                alex+=piles[start];
                lee+=piles[end];
            }else{
                alex+=piles[end];
                lee+=piles[start];
            }
            start++;
            end--;
        }
        return alex>lee;
    }
}
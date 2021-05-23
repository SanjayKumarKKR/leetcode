class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ct=0;
        int st=0,end=people.length-1;
        while(st<=end){
            if(people[st]+people[end]<=limit){
                ct++;
                st++;
                end--;
            }else{
                end--;
                ct++;
            }
        }
        
        return ct;
    }
}
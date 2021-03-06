class RandomizedSet {
    HashSet<Integer> set;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        set = new HashSet<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(set.contains(val)){
            return false;
        }else{
            set.add(val);
            return true;
        }
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!set.contains(val)){
            return false;
        }else{
            set.remove(val);
            return true;
        }
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        Random ran = new Random();
        int x = ran.nextInt(set.size());
        int i=0;
        for(int ele : set){
            if(i==x){
                return ele;
            }
           i++; 
        }
        return 1;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
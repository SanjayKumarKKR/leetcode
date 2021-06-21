class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        PriorityQueue<Map.Entry<Integer, Integer>> queue =new PriorityQueue<>(new priorityComparator());
        queue.addAll(map.entrySet());
        // System.out.println(queue);
        int ans[] =new int [k];
        int j=0;
        while(k!=0){
            ans[j]=queue.poll().getKey();
            j++;
            k--;
        }
        return ans;
    }   
}


    class priorityComparator implements Comparator<Map.Entry<Integer, Integer>>{
    	public int compare(Map.Entry<Integer, Integer> c1, Map.Entry<Integer, Integer> c2){
    		return c2.getValue()-c1.getValue();
    	}
    }

class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> ans =new ArrayList<>();
        HashMap <String,List<String>> map =new HashMap<>();
        for(String path: paths){
            String [] arr =path.split(" ");
            String directory = arr[0];
            for(int i=1;i<arr.length;i++){
                String filename = arr[i].substring(0,arr[i].indexOf("("));
                String content =arr[i].substring(arr[i].indexOf("(")+1,arr[i].length()-1);
                List<String> filepath =map.getOrDefault(content,new ArrayList<>());
                filepath.add(directory+"/"+filename);
                map.put(content,filepath);
            }
        }
        map.entrySet().removeIf(entry -> entry.getValue().size()<2);
        
        // for(String key: map.keySet()){
        //     if(map.get(key).size()<2){
        //         map.remove(key);
        //     }
        // }
        return new ArrayList<>(map.values());
    }
}
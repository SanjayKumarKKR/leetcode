class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[] = s.split(" ");
        if(arr.length!=pattern.length()){return false;}
        HashMap<Character, String> map =new HashMap<>();
        HashMap<String, Character> map1 =new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(pattern.charAt(i)) && !map1.containsKey(arr[i])){
                map.put(pattern.charAt(i),arr[i]);
                map1.put(arr[i],pattern.charAt(i));
            }else if(map.containsKey(pattern.charAt(i)) && !map1.containsKey(arr[i])){
                return false;
            }else if(!map.containsKey(pattern.charAt(i)) && map1.containsKey(arr[i])){
                return false;
            }else{
                String c = map.get(pattern.charAt(i));
                System.out.println(map);
                if(!c.equals(arr[i])){
                    System.out.println(c+" "+arr[i]);
                    return false;
                }
            }
        }
        return true;
    }
}
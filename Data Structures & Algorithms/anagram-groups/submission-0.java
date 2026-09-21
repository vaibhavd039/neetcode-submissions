class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groupMap = new HashMap<>();
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(groupMap.containsKey(key)){
                    groupMap.get(key).add(str);
            } else{
                List<String> group = new ArrayList<>();
                group.add(str);
                groupMap.put(key, group);
            }
        }
        return new ArrayList<>(groupMap.values());
    }
}

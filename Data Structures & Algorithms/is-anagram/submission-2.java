class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int [] counter = new int [26];
        for(char x: s.toCharArray()){
            counter[x-97]++;
        }
        for(char x: t.toCharArray()){
            counter[x-97]--;
            if(counter[x-97]<0){
                return false;
            }
        }
        return true;
        
    }
}

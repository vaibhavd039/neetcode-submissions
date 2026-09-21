class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null && t==null){
            return true;
        }
        if(s==null || t==null){
            return false;
        }
        if (s.length() !=t.length()){
            return false;
        }
        int [] temp = new int [26];
        for(int i =0;i<s.length();i++){
            temp[s.charAt(i)-97]++;
            temp[t.charAt(i)-97]--;
        }
        for(int i =0;i<26;i++){
            if(temp[i]!=0){
                return false;
            }
        }
        return true;
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> myset = new HashSet<>();
        for(int num: nums){
            myset.add(num);
        }
        int maxLength = 0;
        for(int num: nums){
            if(!myset.contains(num-1)){
                int length = 1;
                while(myset.contains(num+length)){
                    length ++;
                }

                maxLength = Math.max(length,maxLength );
            }
        }

        return maxLength;
    }
}

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> myvalue = new HashSet<>();
        for(int num: nums){
            if(myvalue.contains(num)){
                return true;
            }
            myvalue.add(num);
        }
        return false;
    }
}
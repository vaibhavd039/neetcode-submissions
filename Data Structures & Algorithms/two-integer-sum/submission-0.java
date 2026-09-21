class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visited = new HashMap<>();
        for(int i= 0 ;i<nums.length; i++){
            int needed = target - nums[i];
            if(visited.containsKey(needed))
                return  new int[] { visited.get(needed), i };
            else 
              visited.put(nums[i], i);
        }
        return new int[2];
    }
}

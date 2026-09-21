class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i =0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int sum = nums[i]+ nums[j]+ nums[k];
                if (sum==0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                        triplet.add(nums[j++]);
                            triplet.add(nums[k--]);
                            result.add(triplet);
                } else if(sum>0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return new ArrayList<>(result);
    }
}

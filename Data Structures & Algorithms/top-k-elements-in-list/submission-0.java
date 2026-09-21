class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counterMap = new HashMap<>();
        Map<Integer, Set<Integer>> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int currfrequency;
        for(int num: nums){
            
            if(counterMap.containsKey(num)){
                currfrequency = counterMap.get(num);
                counterMap.put(num, currfrequency+1);
                frequencyMap.get(currfrequency).remove(num);
                currfrequency++;
            } else {
                    currfrequency =1;
                    counterMap.put(num , currfrequency);         
            }

            maxFrequency = Math.max(currfrequency, maxFrequency);
            if(frequencyMap.containsKey(currfrequency)){
                        frequencyMap.get(currfrequency).add(num);
            } else {
                        Set<Integer> numlist = new HashSet<>();
                        numlist.add(num);
                        frequencyMap.put(currfrequency, numlist);
            }
        }

        int index =0;
        int [] result = new int [k];
        for(int i=maxFrequency; i>0 && index<k ;i--){
            Set<Integer> bucket =  frequencyMap.get(i);
            for(Integer element: bucket){
                result[index++] = element;
            }
        }
        return result;
    }
}

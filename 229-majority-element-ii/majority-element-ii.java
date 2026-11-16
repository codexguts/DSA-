class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        Map<Integer, Integer> mpp = new TreeMap<>();

        for(int value : nums){
            mpp.put(value, mpp.getOrDefault(value,0) +1);
        }

        for(Map.Entry<Integer, Integer> entry : mpp.entrySet()){
            if(entry.getValue() > n/3){
                ans.add(entry.getKey());
            }

            if(ans.size() == 2){
                break;
            }
        }
        return ans;
    }
}
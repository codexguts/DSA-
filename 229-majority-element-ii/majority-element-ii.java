class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();

        for(int i=0; i<n; i++){
            int curr = nums[i];
            int cnt=0;
            for(int j=0; j<n; j++){
                if(curr == nums[j]){
                    cnt++;
                }
            }
            if(cnt > n/3 && !res.contains(curr)){
                res.add(curr);
            }

            if(res.size() == 2){
                break;
            }
        }
        return res;
    }
}
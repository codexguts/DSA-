class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int cur_sum = 0;
        int sup_sum = 0;

        for(int i=0; i<n; i++){ 
            cur_sum += nums[i];
        }
        for(int i=0; i<=n; i++){ 
            sup_sum += i;
        }
        return(sup_sum - cur_sum);
    }
}
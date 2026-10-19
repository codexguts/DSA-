class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        if(n<2){
            return new int[0];
        }
        for (int first = 0; first < n - 1; first++) {
            for (int second = first + 1; second < n; second++) {
                long sum = (long) nums[first] + nums[second];
 
                // The current pair gives the required sum.
                if (sum == target) {
                    return new int[]{first, second};
                }
            }
        }
        return new int[0];
    }
}
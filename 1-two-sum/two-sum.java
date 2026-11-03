class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        if (n < 2) {
            return new int[0];
        }
 
        Map<Long, Integer> valueToIndex = new HashMap<>();
 
        for (int current = 0; current < n; current++) {
            long complement =
                (long) target - nums[current];
 

            if (valueToIndex.containsKey(complement)) {
                return new int[]{
                    valueToIndex.get(complement),
                    current
                };
            }
 
            valueToIndex.put((long) nums[current], current);
        }
 
        return new int[0];
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        if(n<2){
            return new int[0];
        }
         long[][] valueIndexPairs = new long[n][2];

         for(int index = 0; index < n; index++){
            valueIndexPairs[index][0] = nums[index];
            valueIndexPairs[index][1] = index;
         }

         Arrays.sort(
            valueIndexPairs,
            Comparator.comparingLong(pair -> pair[0])
         );

         int left = 0;
        int right = n - 1;

        while (left < right) {
            long sum =
                valueIndexPairs[left][0] +
                valueIndexPairs[right][0];

    
            if (sum == target) {
                return new int[]{
                    (int) valueIndexPairs[left][1],
                    (int) valueIndexPairs[right][1]
                };
            }

            if (sum < target) {
                left++;
            }
            
            else {
                right--;
            }
        }

        return new int[0];
    }
}
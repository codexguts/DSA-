class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        if(n == 0){
            return 0;
        }

        int maxProduct= nums[0];

        for(int start=0; start<n; start++){
            int currentProduct = 1;

            for(int end=start; end<n; end++){
                currentProduct *= nums[end];
                
                if(currentProduct > maxProduct){
                maxProduct = currentProduct;
                }
            }
        }
        return maxProduct;
    }
}
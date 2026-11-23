class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans= new ArrayList<>();
        Arrays.sort(nums);

        for(int fixed =0; fixed<n-3; fixed++){

            if(fixed > 0 && nums[fixed] == nums[fixed - 1]){
                continue;
            }
            
            for(int nxtfixed= fixed+1; nxtfixed<n-2; nxtfixed++){

                if(nxtfixed > fixed + 1 && nums[nxtfixed] == nums[nxtfixed - 1]){
                    continue;
                }
                int left= nxtfixed+1;
                int right= n-1;

                while(left<right){
                    long sum = 
                        (long) nums[fixed]+
                        nums[nxtfixed]+
                        nums[left]+
                        nums[right];
                    
                    if(sum<target){
                        left++;
                    }

                    else if(sum>target){
                        right--;
                    }

                    else{
                        ans.add(Arrays.asList(
                            nums[fixed],
                            nums[nxtfixed],
                            nums[left],
                            nums[right]
                        ));

                        left++;
                        right--;

                        while(left<right && nums[left] == nums[left-1]){
                            left++;
                        }
                        while(left<right && nums[right] == nums[right+1]){
                            right--;
                        }
                    }
                }
            }
        }
        return ans;
    }
}
                
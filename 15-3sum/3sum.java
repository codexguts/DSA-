class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        if(n<3){
            return new ArrayList<>();
        }

        Set<List<Integer>> uniquetriplets = new HashSet<>();

        for(int i=0; i<n-2; i++){
        Set<Long> SeenValues = new HashSet<>();
            for(int j=i+1; j<n;j++){
                long thirdValue = -((long) nums[i]+nums[j]);

                if(SeenValues.contains(thirdValue)){
                    List<Integer> triplet = new ArrayList<>(
                        Arrays.asList(
                            nums[i],
                            nums[j],
                            (int) thirdValue
                        )
                    );

                    Collections.sort(triplet);
                    uniquetriplets.add(triplet);
                } 

                SeenValues.add((long) nums[j]);
            }
        }
        return new ArrayList<>(uniquetriplets);
    }
}
class Solution {
    public int majorityElement(int[] nums) {
        int cnt =0;
        int el =0;

        for(int value : nums){
            if(cnt ==0){
                el= value;
            }
            if(value == el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        return el;
    }
}
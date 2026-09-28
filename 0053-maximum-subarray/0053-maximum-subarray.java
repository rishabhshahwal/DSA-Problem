class Solution {
    public int maxSubArray(int[] nums) {
        
        int currentsum = nums[0];
        int maximumsum = nums[0];

        for(int i = 1; i < nums.length; i++){
            int option1 = nums[i];
            int option2 = nums[i]+currentsum;
            
            currentsum = Math.max(option1,option2);
            if( currentsum > maximumsum){
                maximumsum = currentsum;
            }
        }
             return maximumsum;
    }
}
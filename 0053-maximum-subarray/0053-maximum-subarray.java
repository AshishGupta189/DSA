class Solution {
    public int maxSubArray(int[] nums) {
       int maxx = nums[0];
       int sum = 0;
       for(int i:nums){
        sum+=i;
        if(sum>maxx) maxx=sum;
        if(sum<0) sum=0;
       } 
       return maxx;
    }
}
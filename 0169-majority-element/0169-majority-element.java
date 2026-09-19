class Solution {
    public int majorityElement(int[] nums) {
        int key = nums[0];
        int c=0;
        for(int i : nums){
            if(c==0){
                key=i;
                c++;
            }else if(i==key) c++;
            else c--;
        }
        return key;
    }
}
public class secondLargest {
    public int secondLargestElement(int[] nums) {
        int lar= nums[0];
        int res = -1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>lar){
                res=lar;
                lar=nums[i];
            }else if(nums[i]>res && lar>nums[i]) res=nums[i];
        }
        return res;
    }
}

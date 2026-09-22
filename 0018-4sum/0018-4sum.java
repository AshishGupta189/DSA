class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> set= new HashSet<>();
        for(int i=0;i<n-3;i++){
            for(int l=i+1;l<n-2;l++){
                long sum = (long) target - nums[l] - nums[i];
                int j=l+1;
                int k=n-1;
                while(j<k){
                    long temp = (long) nums[j] + nums[k];
                    if(temp == sum){
                        set.add(List.of(nums[i],nums[l],nums[j++],nums[k--]));
                    }
                    else if(temp>sum){
                        k--;
                    }else{
                        j++;
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}
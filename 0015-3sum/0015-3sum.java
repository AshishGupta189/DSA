class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        Set<List<Integer>> set= new HashSet<>();
        for(int i=0;i<n-2;i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int sum = 0-nums[i];
            int j = i+1;
            int k = n-1;
            while(j<k){
                int temp = nums[j]+nums[k];
                if(temp==sum){
                    set.add(List.of(nums[i], nums[j++], nums[k--]));
                }else if(temp>sum){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
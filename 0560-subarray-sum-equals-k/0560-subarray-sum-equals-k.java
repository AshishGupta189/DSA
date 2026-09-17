class Solution {

    public int subarraySum(int[] arr, int k) {
        int sum = 0;
        int c = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            int rem = sum - k;
            if (hm.containsKey(rem)) {
                c += hm.get(rem);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return c;
    }
}
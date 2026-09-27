class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res="";
        for(String s :words){
            int sum = 0;
            for(char c : s.toCharArray()){
                int i = c - 'a';
                sum+=weights[i];
            }
            sum%=26;
            res += (char) ('z'-sum);
        }
        return res;
    }
}
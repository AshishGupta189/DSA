class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
            int c = Math.abs(s.charAt(i)-'a'-26);
            //System.out.println(c);
            sum+=c*(i+1);
        }
        return sum;
    }
}
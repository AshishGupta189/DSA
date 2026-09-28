class Solution {
    public int maxDepth(String s) {
        int maxx = 0;
        int ps = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('){
                ps++;
            }else if(c==')'){
                if(maxx<ps){
                    maxx=ps;
                }
                ps--;
            }
        }
        return maxx==0 ? ps : maxx;
    }
}
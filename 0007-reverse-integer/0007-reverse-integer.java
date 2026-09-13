class Solution {
    public int reverse(int x) {
        boolean b=false;
        if(x<0){
            x*=(-1);
            b=true;
        }
        int res=0;
        while(x>0){
            if(res>Integer.MAX_VALUE/10){
                return 0;
            }
            // if(res)
            res=res*10+(x%10);
            x/=10;
        }
        if(b){
            return (-1)*res;
        }
        return res;
    }
}
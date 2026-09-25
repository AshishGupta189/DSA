class Solution {
    public String convert(String s, int numRows) {
        if(s.length()==1 || numRows == 1){
            return s;
        }
        String str="";
        int j=numRows-2;
        for(int i=0;i<numRows;i++){
            int k = i;
            int a = (numRows - i)*2-1;
            while(k<s.length()){
                if(i==0 || i ==numRows-1){
                    str+=s.charAt(k);
                    k+=numRows+j;
                }else{
                    str+=s.charAt(k);
                    if((k+a-1)<s.length()){
                        str+=s.charAt(k+a-1);
                    }
                        k+=numRows+j;
                }
            }
        }
        return str;
    }
}
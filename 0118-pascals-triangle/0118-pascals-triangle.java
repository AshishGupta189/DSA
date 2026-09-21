class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> li = new ArrayList<>();
            for(int j=0;j<i+1;j++){
                if(j==0||j==i){
                    li.add(1);
                }else{
                    List<Integer> arr=res.get(i-1);
                    li.add(arr.get(j)+arr.get(j-1));
                }
            }
            res.add(li);
        }
        return res;
    }
}
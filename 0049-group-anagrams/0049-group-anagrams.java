class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList();
        Map<String,List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char ch[] = strs[i].toCharArray();
            Arrays.sort(ch);
            String ss = new String(ch);
            List<String> li = hm.getOrDefault(ss,new ArrayList<>());
            li.add(strs[i]);
            hm.put(new String(ch),li);
        }
        for(List<String> li : hm.values()){
            list.add(li);
        }
        return list;
    }
}
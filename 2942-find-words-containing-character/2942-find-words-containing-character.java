class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            for(int j=0;j < s.length() ;j++){
                
                if(x==s.charAt(j)){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}
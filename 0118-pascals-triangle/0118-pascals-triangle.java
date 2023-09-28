class Solution {
    List<Integer> generateRow(int row){
         int ans=1;
        ArrayList<Integer> ansRow=new ArrayList<>() ;
        ansRow.add(1);
        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            ansRow.add(ans);
        }
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        ArrayList<List<Integer>> ans= new ArrayList<List<Integer>>();
        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
}
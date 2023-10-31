class Solution {
    public ArrayList<Integer> maxProfit(int[] arr ) {
        ArrayList<Integer> ans=new ArrayList<>();
      int max=MIN_VALUE;
      for(int i=n-1;i>=0;i--){
        if(arr[i]>max){
          ans.add(arr[i]);
          max=arr[i];
        }
        return ans;
        //this is optimized approach with time complexity and space complexity of big oh of n
      }
    }
}

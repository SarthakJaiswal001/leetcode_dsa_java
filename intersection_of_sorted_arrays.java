class Solution{
  public int[] intersection(int[] A, int[] B){
    int i=0,j=0;
    int n=A.length;
    int m=B.length;
    ArrayList<Integer> ans=new ArrayList<>();
    while(i<n && j<m){
      if(A[i] <B[j]){
        i++;}
      else if(B[j]<A[i]){
        j++;}
      else{
        ans.add(A[i]);
        i++;
        j++;
      }}
  }
}
        

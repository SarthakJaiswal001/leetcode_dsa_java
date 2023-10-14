class Solution {
    public int[] rearrangeArray(int[] nums) {
//    // Define 2 vectors, one for storing positive 
//   // and other for negative elements of the array.
//         int n=nums.length;
//   ArrayList<Integer> pos=new ArrayList<>();
//   ArrayList<Integer> neg=new ArrayList<>();
  
//   // Segregate the array into positives and negatives.
//   for(int i=0;i<n;i++){
      
//       if(nums[i]>0) pos.add(nums[i]);
//       else neg.add(nums[i]);
//   }
  
//   // Positives on even indices, negatives on odd.
//   for(int i=0;i<n/2;i++){
      
//       nums[2*i] = pos.get(i);
//       nums[2*i+1] = neg.get(i);
//   }

 
//   return nums;
        int n=nums.length;
        int[] arr=new int[n];
        int posnum=0,negnum=1;
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                arr[negnum]=nums[i];
                negnum+=2;
            }
            else{
                arr[posnum]=nums[i];
                posnum+=2;
            }
        }
        return arr;
    }
}
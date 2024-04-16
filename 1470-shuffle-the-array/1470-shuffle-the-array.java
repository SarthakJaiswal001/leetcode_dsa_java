class Solution {
    public int[] shuffle(int[] nums, int n) {
    
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        int k=0;
        for(int i=0;i<n;i=i+1){
            arr1[k]=nums[i];
            arr2[k]=nums[i+n];
            k++;
        }
        int j=0;
        for(int i=0;i<nums.length;i=i+2){
           nums[i]=arr1[j];
            nums[i+1]=arr2[j];
            j++;
        }
        return nums;
    }
}
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] nya=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[j]< nums[i]){
                        count++;
                    }
                }
                
            }
            
           nya[i]=count; 
        }
        return nya;
    }
}
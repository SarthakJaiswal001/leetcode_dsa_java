class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                max=maximumOf(max,count);
            }
            else{
                count=0;
            }
        }
        return max;
    }
    int maximumOf(int a,int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}//tc will be big oh of n because we have done in single iteration
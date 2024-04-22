class Solution {
    public int[] leftRightDifference(int[] nums) {
   
        int[] answer =new int[nums.length];
        for(int i=0;i<nums.length;i++){
             int sum=0;
            for(int j=0;j<nums.length;j++){
                if(j==i){
                    continue;
                }
                else if(j<i){
                    sum=sum+nums[j];
                }
                else{
                    sum=sum-nums[j];
                }
            }
            answer[i]=Math.abs(sum);
        }
        return answer;
    }
}
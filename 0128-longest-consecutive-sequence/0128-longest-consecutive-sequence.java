class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
 int n=nums.length;
        if(nums.length==0){
            return 0;
        }
        int countCurrent=0;
        int lastSmaller=Integer.MIN_VALUE;
        int longest=1;
        for(int i=0;i<n;i++){
            if(nums[i]-1 == lastSmaller){
                lastSmaller=nums[i];
                countCurrent+=1;
            }
            else if(lastSmaller!=nums[i]){
                countCurrent=1;
                lastSmaller=nums[i];
            }
            longest= Math.max(longest, countCurrent);
        }
        return longest;
    }
}
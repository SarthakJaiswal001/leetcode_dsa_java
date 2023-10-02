class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Initialize the maximum sum with the first element of the array
    int currentSum = nums[0]; // Initialize the current sum with the first element of the array

    for (int i = 1; i < nums.length; i++) {
        // Update the current sum by either extending the subarray or starting a new subarray
        currentSum = Math.max(nums[i], currentSum + nums[i]);
        
        // Update the maximum sum if the current sum is greater
        maxSum = Math.max(maxSum, currentSum);
    }

    return maxSum; 
    }
}
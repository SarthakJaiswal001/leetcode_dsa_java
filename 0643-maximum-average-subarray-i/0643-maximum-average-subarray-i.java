class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int n = nums.length;
        
        // Calculate the sum of the first k elements
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        // Initialize maxSum with the sum of the first k elements
        int maxSum = sum;
        
        // Iterate through the array to find the maximum average subarray
        for (int i = k; i < n; i++) {
            // Slide the window by subtracting the leftmost element and adding the rightmost element
            sum = sum - nums[i - k] + nums[i];
            
            // Update maxSum if the current sum is greater
            maxSum = Math.max(maxSum, sum);
        }
        
        // Return the maximum average by dividing maxSum by k
        return (double) maxSum / k;
    }
}
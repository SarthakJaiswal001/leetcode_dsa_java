class Solution {
    public void nextPermutation(int[] nums) {
       int n = nums.length;
    
    // Step 1: Find the first pair (i, i-1) where nums[i-1] < nums[i]
    int i = n - 1;
    while (i > 0 && nums[i-1] >= nums[i]) {
        i--;
    }
    
    // Step 2: If such a pair is found, find the smallest nums[j] to the right of nums[i-1] such that nums[j] > nums[i-1]
    if (i > 0) {
        int j = n - 1;
        while (nums[j] <= nums[i-1]) {
            j--;
        }
        
        // Step 3: Swap nums[i-1] and nums[j]
        int temp = nums[i-1];
        nums[i-1] = nums[j];
        nums[j] = temp;
    }
    
    // Step 4: Reverse the subarray to the right of nums[i-1]
    int left = i;
    int right = n - 1;
    while (left < right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
        right--;
    }
    
    // If no such pair was found in step 1, the array is in descending order, so reverse the entire array
    // This will give the smallest lexicographical permutation
    // Otherwise, we've found the next permutation.  
    }
}
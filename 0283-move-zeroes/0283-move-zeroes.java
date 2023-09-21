class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Pointer to keep track of the current non-zero index

    // Traverse the array
    for (int i = 0; i < nums.length; i++) {
        // If the current element is not 0, move it to the non-zero index
        if (nums[i] != 0) {
            nums[nonZeroIndex] = nums[i];
            
            // If there's a gap between non-zero elements and the current position,
            // fill the gap with 0
            if (nonZeroIndex != i) {
                nums[i] = 0;
            }
            
            nonZeroIndex++; // Increment the non-zero index
        }
    }
    }
}
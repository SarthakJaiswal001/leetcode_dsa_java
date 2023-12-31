class Solution {
    public int removeDuplicates(int[] nums) {
          if (nums.length == 0) {
        return 0; // If the array is empty, no duplicates to remove.
    }

    int uniqueCount = 1; // Initialize with the first element, which is always unique.

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            nums[uniqueCount] = nums[i]; // Move the unique element to the next position.
            uniqueCount++;
        }
    }

    return uniqueCount;
    }
}
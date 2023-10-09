class Solution {
    public void sortColors(int[] nums) {
       int redCount = 0;
    int whiteCount = 0;
    int blueCount = 0;

    // First pass: Count the number of each color
    for (int num : nums) {
        if (num == 0) {
            redCount++;
        } else if (num == 1) {
            whiteCount++;
        } else {
            blueCount++;
        }
    }

    // Second pass: Overwrite the original array with the sorted colors
    int index = 0;
    for (int i = 0; i < redCount; i++) {
        nums[index++] = 0;
    }
    for (int i = 0; i < whiteCount; i++) {
        nums[index++] = 1;
    }
    for (int i = 0; i < blueCount; i++) {
        nums[index++] = 2;
    }
    }
}
class Solution {
    public int removeDuplicates(int[] nums) {
       if (nums.length <= 2) {
            return nums.length;
        }

        int slow = 2; // Represents the position to update in the modified array

        for (int fast = 2; fast < nums.length; fast++) {
            // Check if the current element is different from the two elements before it
            if (nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow; 
    }
}
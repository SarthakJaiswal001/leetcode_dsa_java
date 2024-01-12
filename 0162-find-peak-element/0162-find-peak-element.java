class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // Peak element is on the left side
                right = mid;
            } else {
                // Peak element is on the right side (or mid itself)
                left = mid + 1;
            }
        }

        return left;
    }
}
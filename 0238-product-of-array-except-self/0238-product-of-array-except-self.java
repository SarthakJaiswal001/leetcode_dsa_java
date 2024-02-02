class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        // Initialize arrays to store products from the left and right of each element
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];

        // Initialize the result array
        int[] result = new int[n];

        // Calculate the products to the left of each element
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        // Calculate the products to the right of each element
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        // Calculate the final result array by multiplying left and right products
        for (int i = 0; i < n; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result; 
    }
}
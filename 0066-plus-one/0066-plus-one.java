class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Start from the least significant digit
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                // If the current digit is less than 9, we can simply increment it and return
                digits[i]++;
                return digits;
            } else {
                // If the current digit is 9, set it to 0 and continue with the next higher digit
                digits[i] = 0;
            }
        }
        
        // If we reach here, it means all digits were 9, so we need to add a new digit at the beginning
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}
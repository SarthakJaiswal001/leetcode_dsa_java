class Solution {
    public int compress(char[] chars) {
      int index = 0; // pointer to update the array in place
        int i = 0; // pointer to traverse the array

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count consecutive repeating characters
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Update the array in place
            chars[index++] = currentChar;

            // Append count only if it is greater than 1
            if (count > 1) {
                char[] countChars = Integer.toString(count).toCharArray();
                for (char c : countChars) {
                    chars[index++] = c;
                }
            }
        }

        return index;   
    }
}
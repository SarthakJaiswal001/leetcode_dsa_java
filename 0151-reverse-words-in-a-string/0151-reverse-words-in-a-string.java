class Solution {
    public String reverseWords(String s) {
         // Split the input string into words using space as the delimiter
        String[] words = s.trim().split("\\s+");

        // Reverse the order of the words
        for (int i = 0, j = words.length - 1; i < j; i++, j--) {
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
        }

        // Join the reversed words into a single string with a single space between them
        return String.join(" ", words);
    }
}
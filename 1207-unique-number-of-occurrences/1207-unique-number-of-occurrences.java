class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       Map<Integer, Integer> countMap = new HashMap<>();

        // Count occurrences of each element
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        Set<Integer> uniqueOccurrences = new HashSet<>();

        // Check for unique occurrences
        for (int count : countMap.values()) {
            if (!uniqueOccurrences.add(count)) {
                // If count is already present, it's not unique
                return false;
            }
        }

        // All counts are unique
        return true; 
    }
}
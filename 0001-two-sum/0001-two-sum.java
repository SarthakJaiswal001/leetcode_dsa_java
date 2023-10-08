class Solution {
    public int[] twoSum(int[] nums, int target) {
       // Create a HashMap to store the elements and their indices
        HashMap<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If the complement is in the map, we found the solution
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            
            // Otherwise, put the current number in the map with its index
            numMap.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array
        return new int[0];  
    }
}
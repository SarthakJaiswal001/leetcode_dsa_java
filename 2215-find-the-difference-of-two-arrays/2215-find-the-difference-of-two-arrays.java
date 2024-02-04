class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
       List<Integer> notInNums2 = new ArrayList<>();
        List<Integer> notInNums1 = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        for (int num : nums1) {
            if (!set2.contains(num) && !notInNums2.contains(num)) {
                notInNums2.add(num);
            }
        }

        for (int num : nums2) {
            if (!set1.contains(num) && !notInNums1.contains(num)) {
                notInNums1.add(num);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        result.add(notInNums2);
        result.add(notInNums1);

        return result;
    }
}
class Solution {
    public int[][] merge(int[][] intervals) {
         if (intervals == null || intervals.length <= 1) {
            return intervals;
        }

        // Step 1: Sort intervals based on the start time
        Arrays.sort(intervals, Comparator.comparingInt(interval -> interval[0]));

        // Step 2: Merge overlapping intervals
        List<int[]> mergedIntervals = new ArrayList<>();
        mergedIntervals.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] currentInterval = intervals[i];
            int[] previousInterval = mergedIntervals.get(mergedIntervals.size() - 1);

            if (currentInterval[0] <= previousInterval[1]) {
                // Merge overlapping intervals
                previousInterval[1] = Math.max(currentInterval[1], previousInterval[1]);
            } else {
                // Add non-overlapping interval to the result
                mergedIntervals.add(currentInterval);
            }
        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
    }
}
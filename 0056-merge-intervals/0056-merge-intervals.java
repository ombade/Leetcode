import java.util.*;

class Solution {

    public int[][] merge(int[][] intervals) {

        Arrays.sort(
                intervals,
                Comparator.comparingInt((int[] row) -> row[0])
                          .thenComparingInt(row -> row[1])
        );

        ArrayList<int[]> result = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {

            int start = intervals[i][0];
            int end = intervals[i][1];

            // Already covered by previous merged interval
            if (!result.isEmpty() && end <= result.get(result.size() - 1)[1]) {
                continue;
            }

            for (int j = i; j < intervals.length; j++) {

                if (end >= intervals[j][0]) {
                    end = Math.max(end, intervals[j][1]);
                } else {
                    break;
                }
            }

            result.add(new int[]{start, end});
        }

        return result.toArray(new int[0][]);
    }
}
package Greedy;
import java.util.*;
// Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

// Example 1:

// Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
// Output: 1
// Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
// Example 2:

// Input: intervals = [[1,2],[1,2],[1,2]]
// Output: 2
// Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.
// Example 3:

// Input: intervals = [[1,2],[2,3]]
// Output: 0
// Explanation: You don't need to remove any of the intervals since they're already non-overlapping.
 

// Constraints:

// 1 <= intervals.length <= 2 * 104
// intervals[i].length == 2
// -2 * 104 <= starti < endi <= 2 * 104

public class NonOverlap {
    public int eraseOverlapIntervals(int[][] intervals) {
        int overlap = 0;
        int prev_end = Integer.MIN_VALUE;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int[] i:intervals){
            if(prev_end>i[0]) {
                overlap++;
                prev_end = Math.min(i[1], prev_end);
            } else {
                prev_end = i[1];
            }
        }
        return overlap;
        
    }
}

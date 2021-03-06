package Greedy;
import java.util.*;
// Given an array of events where events[i] = [startDayi, endDayi]. Every event i starts at startDayi and ends at endDayi.

// You can attend an event i at any day d where startTimei <= d <= endTimei. Notice that you can only attend one event at any time d.

// Return the maximum number of events you can attend.

 

// Example 1:


// Input: events = [[1,2],[2,3],[3,4]]
// Output: 3
// Explanation: You can attend all the three events.
// One way to attend them all is as shown.
// Attend the first event on day 1.
// Attend the second event on day 2.
// Attend the third event on day 3.
// Example 2:

// Input: events= [[1,2],[2,3],[3,4],[1,2]]
// Output: 4
// Example 3:

// Input: events = [[1,4],[4,4],[2,2],[3,4],[1,1]]
// Output: 4
// Example 4:

// Input: events = [[1,100000]]
// Output: 1
// Example 5:

// Input: events = [[1,1],[1,2],[1,3],[1,4],[1,5],[1,6],[1,7]]
// Output: 7
 

// Constraints:

// 1 <= events.length <= 105
// events[i].length == 2
// 1 <= startDayi <= endDayi <= 105
public class MaxEvens {
    public int maxEvents(int[][] events) {
        int n=events.length, i=0, count=0, day=1;
        // sort arrays in ascending order based on start day
        Arrays.sort(events,(a,b)->a[0]-b[0]);
        // pq which stores in ascending order by end day
        PriorityQueue <int[]> pq = new PriorityQueue<int[]>((a,b) -> a[1] - b[1]);
       //while events are available
        while(i<n || !pq.isEmpty()){
            // if event is starting today, add it to pq
            while(i<n && events[i][0] == day)  pq.add(events[i++]);
            // if event has ended then we dont count it but remove it from pq
            while(!pq.isEmpty() && pq.peek()[1]<day) pq.poll();
            // if event is ongoing we count it and then remove it from pq
            if(!pq.isEmpty() && pq.peek()[1]>=day){
                pq.poll();
                count++;
            }
        day++;
            
        }
        
        return count;
    }
}

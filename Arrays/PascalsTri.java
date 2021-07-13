package Arrays;
import java.util.*;
// Given an integer numRows, return the first numRows of Pascal's triangle.

// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]
 

// Constraints:

// 1 <= numRows <= 30
class PascalsTri{
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> tri = new ArrayList<List<Integer>>();
        tri.add(new ArrayList<>());
        tri.get(0).add(1); // first element is always [1];
        
        for(int i=1;i<n;i++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = tri.get(i-1);
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);
            tri.add(row);
        }
        return tri;
    }
}
package Greedy;
// Given a string s and an array of integers cost where cost[i] is the cost of deleting the ith character in s.

// Return the minimum cost of deletions such that there are no two identical letters next to each other.

// Notice that you will delete the chosen characters at the same time, in other words, after deleting a character, the costs of deleting other characters will not change.

 

// Example 1:

// Input: s = "abaac", cost = [1,2,3,4,5]
// Output: 3
// Explanation: Delete the letter "a" with cost 3 to get "abac" (String without two identical letters next to each other).
// Example 2:

// Input: s = "abc", cost = [1,2,3]
// Output: 0
// Explanation: You don't need to delete any character because there are no identical letters next to each other.
// Example 3:

// Input: s = "aabaa", cost = [1,2,3,4,1]
// Output: 2
// Explanation: Delete the first and the last character, getting the string ("aba").
 

// Constraints:

// s.length == cost.length
// 1 <= s.length, cost.length <= 10^5
// 1 <= cost[i] <= 10^4
// s contains only lowercase English letters.
public class MinDelCost {
    public int minCost(String s, int[] cost) {
        int result = 0,max = 0;// result and pointer to highest cost element among duplicates
        char[] a = s.toCharArray();
        for(int i = 1; i < a.length; ++i){
            if(a[max] == a[i]){
                result += Math.min(cost[max], cost[i]); //storing min cost in the result
                if(cost[max] < cost[i]) max = i; 
                //if cost of i is higher than max we delete max hence we do max = i;
            }
            else max = i; 
            //if elements are not identical. we just move max to i
        }
        //return the min cost
        return result;
    }
}

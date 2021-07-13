package Greedy;
// Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.
import java.util.*;
// Example 1:

// Input: num = "1432219", k = 3
// Output: "1219"
// Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
// Example 2:

// Input: num = "10200", k = 1
// Output: "200"
// Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
// Example 3:

// Input: num = "10", k = 2
// Output: "0"
// Explanation: Remove all the digits from the number and it is left with nothing which is 0.
 

// Constraints:

// 1 <= k <= num.length <= 105
// num consists of only digits.
// num does not have any leading zeros except for the zero itself.
public class RemoveK {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<num.length();i++){
            char currentDigit = num.charAt(i);
            while(!stk.isEmpty() && stk.peek() > currentDigit && k > 0) {
                stk.pop();
                --k;
            }
            stk.push(currentDigit);
        }
        
        //corner case: eg: "1111", cannot find decreasing -> no deletion 
        while (k > 0) {
            stk.pop();
            --k;
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty()) {
            sb.append(stk.pop());
        }
        
        sb.reverse();
        // deleting leading ones
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
         return sb.toString();
    }
}

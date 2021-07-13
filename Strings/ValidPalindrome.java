package Strings;
// Given a string s, return true if the s can be palindrome after deleting at most one character from it.

// Example 1:

// Input: s = "aba"
// Output: true
// Example 2:

// Input: s = "abca"
// Output: true
// Explanation: You could delete the character 'c'.
// Example 3:

// Input: s = "abc"
// Output: false
 

// Constraints:

// 1 <= s.length <= 105
// s consists of lowercase English letters.
public class ValidPalindrome {
    public boolean validPalindrome(String s) {
      
        int i = 0;
        int n = s.length() - 1;
        while (i < n) { 
            if (s.charAt(i) != s.charAt(n)) {
                // if not Palindrome 
                boolean a = vp(i + 1, n, s);
                boolean b = vp(i, n - 1, s);
                return  a||b ;
            }
            i++;
            n--;
        }
        return true;
      }
    
    // continue checking Palindrome  after deleting an element
      boolean vp(int i, int n, String s) {
            while (i < n) {
                if (s.charAt(i) != s.charAt(n)) return false;
                i++;
                n--;
            }
            return true;
       }
}

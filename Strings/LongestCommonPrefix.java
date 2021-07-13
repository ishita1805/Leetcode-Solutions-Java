package Strings;
// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".

 

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.
 

// Constraints:

// 1 <= strs.length <= 200
// 0 <= strs[i].length <= 200
// strs[i] consists of only lower-case English letters.
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        
        String prefix = strs[0];
        
//         indexOf(prefix) will return the strating index of the prefix in the string if the complete prefix sits in the string. else it will return 0
        
       
        for(int i=1;i<strs.length;i++){ //works n-1 times
            //iterations reduce as we move forward in the above loop
            while(!strs[i].startsWith(prefix)){ 
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}

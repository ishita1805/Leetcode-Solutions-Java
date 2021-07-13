package Arrays;

// Given an array nums of integers, return how many of them contain an even number of digits.

// Input: nums = [12,345,2,6,7896]
// Output: 2
// Explanation: 
// 12 contains 2 digits (even number of digits). 
// 345 contains 3 digits (odd number of digits). 
// 2 contains 1 digit (odd number of digits). 
// 6 contains 1 digit (odd number of digits). 
// 7896 contains 4 digits (even number of digits). 
// Therefore only 12 and 7896 contain an even number of digits.


// Input: nums = [555,901,482,1771]
// Output: 1 
// Explanation: 
// Only 1771 contains an even number of digits.

// Constraints:

// 1 <= nums.length <= 500
// 1 <= nums[i] <= 10^5

public class EvenDigits {
    public int findNumbers(int[] nums) {
        int even = 0;
        for(int i:nums) {
            int digits= 1;
            while(i>9){
                i /= 10;
                digits++;
            }
            if(digits%2 == 0) even++;
        }
        return even;
    }
    // or
    public int findNumbers2(int[] nums) {
        int even = 0;
        for(int i:nums) {
            if (String.valueOf(i).length() % 2 == 0) {
                even++;
            }
        }
        return even;
    }
}




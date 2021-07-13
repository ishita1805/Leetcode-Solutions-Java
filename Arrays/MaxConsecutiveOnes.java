package Arrays;

// Example 1
// Input: nums = [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

// Example 2
// Input: nums = [1,0,1,1,0,1]
// Output: 2

// Constraints:
// 1 <= nums.length <= 105
// nums[i] is either 0 or 1.

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int score = 0,highest=0;
        for(int i:nums){
            if(i>0) {
                score++;
                if(score>highest) highest = score;
            }
            else score=0;
         
        }
        return highest;
    }
}

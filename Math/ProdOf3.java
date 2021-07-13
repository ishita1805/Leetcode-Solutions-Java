package Math;
// Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

// Example 1:

// Input: nums = [1,2,3]
// Output: 6
// Example 2:

// Input: nums = [1,2,3,4]
// Output: 24
// Example 3:

// Input: nums = [-1,-2,-3]
// Output: -6
 

// Constraints:

// 3 <= nums.length <= 104
// -1000 <= nums[i] <= 1000
public class ProdOf3 {
    public int maximumProduct(int[] nums) {

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        
        for(int i: nums){
            if(max1<i) {
                max3 = max2;
                max2 = max1;
                max1 = i;
            }else if(max2<i){
                max3 = max2;
                max2 = i;
            } else if(max3<i){
                max3 = i;
            }
            if(min1>i) {
                min2 = min1;
                min1 = i;
            } else if(min2>i){
                min2 = i;
            }
        }
        return Math.max(min1*min2*max1, max1*max2*max3);
    }
}

package Arrays;

// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

// Input: nums = [-4,-1,0,3,10]
// Output: [0,1,9,16,100]
// Explanation: After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100].

// Input: nums = [-7,-3,2,3,11]
// Output: [4,9,9,49,121]

public class SquaresArray {
    public int[] sortedSquares(int[] nums) {
        int[] sorted = new int[nums.length];
        int k = 0,temp = 0;
        for(int i:nums){
            sorted[k] = i*i;
            k++;
        }
        for(int i=0;i<sorted.length;i++){
            for(int j=i+1;j<sorted.length;j++){
                if(sorted[i]>sorted[j]){
                    temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }
}

package Arrays;
// You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
// and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be 
// stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the 
// first m elements denote the elements that should be merged, and the last n elements are set to 0 
// and should be ignored. nums2 has a length of n.

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

// Input: nums1 = [1], m = 1, nums2 = [], n = 0
// Output: [1]
// Explanation: The arrays we are merging are [1] and [].
// The result of the merge is [1].

// Input: nums1 = [0], m = 0, nums2 = [1], n = 1
// Output: [1]
// Explanation: The arrays we are merging are [] and [1].
// The result of the merge is [1].
// Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

// Constraints:

// nums1.length == m + n
// nums2.length == n
// 0 <= m, n <= 200
// 1 <= m + n <= 200
// -109 <= nums1[i], nums2[j] <= 109

public class MergeSorted {
     public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m1 = 0, n1 = 0, i = 0;
        int merge[] = new int[m+n]; 
        
            if(n != 0 && m !=0) {
            for(int l=0;l<m+n;l++){
                    merge[l]=nums1[l];
            }
            while(m1<m && n1<n){
                if(merge[m1]<=nums2[n1]) {
                    nums1[i] = merge[m1];
                    m1++;
                } else {
                    nums1[i] = nums2[n1];
                    n1++;
                }
                i++;
            }
            while(n1<n && m1==m){
                nums1[i] = nums2[n1];
                n1++;
                i++;
            }
            while(n1==n && m1<m){
                nums1[i] = merge[m1];
                m1++;
                i++;
            }
        } 
        else if(m == 0) {
            for(int l=0;l<n;l++) nums1[l] = nums2[l];
            
        }
    }
}

import java.util.Arrays;

class Main {
    static int[] SubArraySum(int[] arr, int target) {
        int start = 0, currentSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            // shrink window until sum <= target
            while (currentSum > target && start <= end) {
                currentSum -= arr[start];
                start++;
            }

            if (currentSum == target) {
                return new int[]{start, end}; // 0-based indices
            }
        }

        return new int[]{-1}; // not found
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.println(Arrays.toString(SubArraySum(ar, target))); // [1, 3]
    }
}



/*

Given an array arr[] containing only non-negative integers, 
your task is to find a continuous subarray (a contiguous sequence of elements) whose sum equals a specified value target. 
You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. 
You need to find the first subarray whose sum is equal to the target.

Note: If no such array is possible then, return [-1].


Examples:

Input: arr[] = [1, 2, 3, 7, 5], target = 12
Output: [2, 4]
Explanation: The sum of elements from 2nd to 4th position is 12.

Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], target = 15
Output: [1, 5]
Explanation: The sum of elements from 1st to 5th position is 15.

Input: arr[] = [5, 3, 4], target = 2
Output: [-1]
Explanation: There is no subarray with sum 2.


Constraints:
1 <= arr.size()<= 106
0 <= arr[i] <= 103
0 <= target <= 109

Hint below :

















Algorithms ArraysData Structures prefix-sum Searching sliding-window

*/

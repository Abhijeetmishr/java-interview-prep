package DSA.Array.TwoPointer;

/**
 * Problem Statement
Given a sorted array, create a new array containing squares of all the numbers of the input array in the sorted order.

Example 1:

Input: [-2, -1, 0, 2, 3]
Output: [0, 1, 4, 4, 9]
Example 2:

Input: [-3, -1, 0, 1, 2]
Output: [0, 1, 1, 4, 9]
 */
public class SquaringSortedArray {
    public static int[] sortedArray(int[] arr) {
        int n = arr.length;
        int[] squares = new int[n];
        
        int left = 0, right = n-1;
        int k = n-1;

        while(left < right) {
            int leftS = arr[left] * arr[left];
            int rightS = arr[right] * arr[right];

            if(leftS > rightS){
                squares[k--] = leftS;
                left++;
            } else {
                squares[k--] = rightS;
                right--;
            }
        }
        squares[0] =  arr[left] * arr[left];
        return squares;
    }
}

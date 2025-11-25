package DSA.Array.TwoPointer;

/**
 * Similar problems:
 * 1. https://leetcode.com/problems/sort-colors/description/
 * 2.https://www.codingninjas.com/codestudio/problems/dutch-national-flag-problem_8230821
 * 3. https://www.geeksforgeeks.org/dsa/sort-an-array-of-0s-1s-and-2s/
 * 4.https://www.geeksforgeeks.org/dsa/segregate-0s-and-1s-in-an-array-by-traversing-array-once/
 */
public class DutchNationalFlag {
    public static int[] sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low++] = arr[mid];
                arr[mid] = temp;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[high];
                arr[high--] = arr[mid];
                arr[mid] = temp;
            }
        }
        return arr;
    }
}

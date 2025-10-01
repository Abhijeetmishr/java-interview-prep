package DSA.Greedy;

import java.util.Arrays;

public class IncreasingTripletSequence {
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= first) {
                first = n; // update first if n is smaller than both
            } else if (n <= second) {
                second = n; // update second only if greater than first but smaller than second
            } else {
                // We have found a number greater than both first and second
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 0, 4, 6};
        System.out.println("Input: " + Arrays.toString(nums));
        boolean result = increasingTriplet(nums);
        System.out.println("Output: " + result); // Output: true
    }
}
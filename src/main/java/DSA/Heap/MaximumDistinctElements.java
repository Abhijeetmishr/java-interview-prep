package DSA.Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
/**
 * 
 * Given an array of numbers nums and an integer K, find the maximum number of distinct elements after removing exactly K elements from the nums array.

    Example 1:

    Input: nums = [7, 3, 5, 8, 5, 3, 3], K=2
    Expected Output: 3
    Explanation: We can remove two occurrences of 3 to be left with 3 distinct numbers [7, 3, 8],
    we have to skip 5 because it is not distinct and occurred twice.
    Another solution could be to remove one instance of '5' and '3' each to be left with three distinct numbers [7, 5, 8], in this case, we have to skip 3 because it occurred twice.
 */

public class MaximumDistinctElements {
    public int findMaximumDistinctElements(int[] nums, int k) {
        int distinctElementsCount = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<Map.Entry<Integer, Integer>>(
                (a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 1) {
                distinctElementsCount++;
            } else {
                minHeap.add(entry);
            }
        }

        while (k > 0 && !minHeap.isEmpty()) {
            Map.Entry<Integer, Integer> entry = minHeap.poll();
            k -= entry.getValue() - 1;
            if (k >= 0) {
                distinctElementsCount++;
            }
        }

        if (k > 0) {
            distinctElementsCount -= k;
        }

        return distinctElementsCount;
    }
}

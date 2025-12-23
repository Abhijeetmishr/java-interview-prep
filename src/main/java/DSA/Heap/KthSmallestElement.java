package DSA.Heap;

public class KthSmallestElement {
    public int findKthSmallestElement(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, k - 1);
    }

    public int quickSelect(int[] nums, int low, int high, int k) {
        int pivot = nums[high];
        int pivot_idx = partition(nums, low, high, pivot);

        if (pivot_idx == k) {
            return nums[pivot_idx];
        } else if (pivot_idx < k) {
            return quickSelect(nums, pivot_idx + 1, high, k);
        } else {
            return quickSelect(nums, low, pivot_idx - 1, k);
        }
    }

    public int partition(int[] nums, int low, int high, int pivot) {
        int i = low;
        int j = low;

        while(i <= high) {
            if (nums[i] <= pivot) {
                // swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j - 1; // pivot is at j-1 index
    }
}

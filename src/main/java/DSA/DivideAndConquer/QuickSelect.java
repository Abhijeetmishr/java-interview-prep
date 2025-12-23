package DSA.DivideAndConquer;

public class QuickSelect {
    //Find Kth smallest element in an unsorted array
    public static int quickSelect(int[] arr, int low, int high, int k) {
        int pivot = arr[high];
        int pivot_idx = partition(arr, low, high, pivot);
        if(k > pivot_idx) {
            return quickSelect(arr, pivot_idx + 1, high, k);
        } else if(k < pivot_idx) {
            return quickSelect(arr, low, pivot_idx - 1, k);
        } else {
            return arr[pivot_idx];
        }
    }

    public static int partition(int[] arr, int low, int high, int pivot) {
        int i = low, j = low; 
        while(i <= high){
            if(arr[i] <= pivot){
                swap(i, j, arr);
                i++;
                j++;
            } else {
                i++;
            }
        }
        return j-1;
    }

    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 8, 2, 3};
        int val = quickSelect(arr, 0, 5, 3);
        System.out.println(val);
    }
}

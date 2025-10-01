package DSA.Array.PrefixSum;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
     public int[] productExceptSelf(int[] nums) {
        //nums = [1, 2, 3, 4]
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        
        //Calculate Prefix Sum
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        // Prefix Sum After Calculation - [1, 1, 2, 6]

        //Now calculate suffix sum
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        // Suffix sum after calculation - [24, 12, 8, 6]
        return ans;
    }
}

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n];
        int[] postfixSum = new int[n];
        int[] ans = new int[n];

        prefixSum[0] = 1;
        postfixSum[n - 1] = 1;

        for(int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i-1] * nums[i-1];
        }

        for(int i = n-2; i >= 0; i--) {
            postfixSum[i] = postfixSum[i+1] * nums[i+1];
        }

        for(int k = 0; k < n; k++) {
            ans[k] = prefixSum[k] * postfixSum[k];
        }
        
        return ans;
    }
}
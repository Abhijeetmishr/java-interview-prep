package DSA.Array.BinarySearch;

public class MySqrt {
    public static int mySqrt(int n) {
        if(n < 2) return n;
        int left = 2, right = n/2;
        int mid;

        while(left <= right) {
            mid = left + (right-left)/2;
            long num = (long) mid * mid;
            if (num > n) 
                right = mid - 1;
            else if(num < n)
                left = mid+1;
            else 
                return mid;
        }
        return right;
    }

    public static void main(String[] args) {
        int input1 = 4;
        int expectedOutput1 = 2;
        int result1 = mySqrt(input1);
        System.out.println(result1 == expectedOutput1); // Expected output: true
    }
  
}

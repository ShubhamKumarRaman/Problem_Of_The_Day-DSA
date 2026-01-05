
public class J05MaxSumSubArray {

    // Approach 1 O(n)2
    public static int maxSumSubArray(int[] arr, int k) {
        int result = 0;
        int start = 0;
        int end = k;
        while (end <= arr.length) {
            int current = 0;
            for (int i = start; i < end; i++) {
                current += arr[i];
            }
            start++;
            end++;
            result = current > result ? current : result;
        }
        return result;
    }

    //Approach 2- Sliding window
    public static int maxSumSubArray2(int[] arr, int k) {
        int n = arr.length;
        int start = 0;
        int end = k;
        int current = 0;
        for (int i = start; i < end; i++) {
            current += arr[i];
        }
        int result = current;
        while (end < n) {
            current = (current - arr[start++] + arr[end++]);
            result = result < current ? current : result;
        }
        return result;
    }

    // Approach 3- optimized sliding window
    public static int maxSumSubArray3(int[] arr, int k) {
        int n = arr.length;
        if (n < k) {
            return -1;
        }
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;

        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = maxSum < windowSum ? windowSum : maxSum;
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        System.out.println("Max sum : " + maxSumSubArray(arr, 4));
        System.out.println("Max sum : " + maxSumSubArray2(arr, 4));
        System.out.println("Max sum : " + maxSumSubArray3(arr, 4));

        int[] arr2 = {100, 200, 300, 400};
        System.out.println("Max sm : " + maxSumSubArray(arr2, 1));
        System.out.println("Max sm : " + maxSumSubArray2(arr2, 1));
        System.out.println("Max sm : " + maxSumSubArray3(arr2, 1));
    }
}

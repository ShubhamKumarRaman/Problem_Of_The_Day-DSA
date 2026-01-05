
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

    public static void main(String args[]) {
        int[] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        System.out.println("Max sum : " + maxSumSubArray(arr, 4));

        int[] arr2 = {100, 200, 300, 400};
        System.out.println("Max sm : " + maxSumSubArray(arr2, 1));
    }
}

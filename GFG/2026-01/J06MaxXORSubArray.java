
public class J06MaxXORSubArray {

    public static int maxXOR(int[] arr, int k) {
        // code here
        int n = arr.length;
        if (n < k) {
            return -1;
        }

        int windowXOR = 0;
        for (int i = 0; i < k; i++) {
            windowXOR = windowXOR ^ arr[i];
        }
        int maxXOR = windowXOR;

        for (int i = 1; i < n - k; i++) {
            windowXOR = windowXOR ^ arr[i - 1] ^ arr[n - k - 1];
            maxXOR = Math.max(maxXOR, windowXOR);
        }
        return maxXOR;
    }

    public static void main(String args[]) {
        int[] arr = {2, 5, 8, 1, 1, 3};
        System.out.println("Max: " + maxXOR(arr, 3));

        int[] arr2 = {1, 2, 4, 5, 6};
        System.out.println("Max: " + maxXOR(arr2, 2));
    }
}

import java.util.ArrayList;

public class J02MissingRepeating {
    // Approach 1 - Using count frequency
    public static ArrayList<Integer> usingFrequency(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];

        // Count frequency
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        int missing=0, duplicate = 0;
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) {
                missing = i;
            }
            if (freq[i] > 1) {
                duplicate = i;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result.add(duplicate);
        result.add(missing);
        return result;
    }

    public static void main(String args[]) {
        int[] arr = { 4, 3, 6, 2, 1, 1 };
        System.out.println("Using count Frequency: "+usingFrequency(arr));
    }
}

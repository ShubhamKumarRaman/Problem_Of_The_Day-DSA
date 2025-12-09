// Array Duplicate

import java.util.ArrayList;
import java.util.Arrays;

public class J01ArrayDuplicate {
    // Approach 1 - Using Sorting
    public static ArrayList<Integer> usingSorting(int[] arr) {
        // Sort the array
        Arrays.sort(arr);

        ArrayList<Integer> result = new ArrayList<>();
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            if (arr[i] == arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        return result;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 3, 1, 2, 3 };
        ArrayList<Integer> result = usingSorting(arr);
        System.out.println(result.toString());

        int[] arr2 = { 3, 1, 2 };
        result = usingSorting(arr2);
        System.out.println(result.toString());
    }
}
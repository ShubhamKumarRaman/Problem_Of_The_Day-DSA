
import java.util.Arrays;

public class J04Sort012 {

    //Using Sorting
    public static int[] usingSorting(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    //Using count element
    public static int[] usingCountElement(int[] arr) {
        int count1 = 0;
        int count2 = 0;
        //Count 1 and 2
        for (int n : arr) {
            if (n == 1) {
                count1++;
            } else if (n == 2) {
                count2++;
            }
        }
        //assign 1 and 2
        int idx = arr.length - 1;
        for (int i = 0; i < count2; i++) {
            arr[idx--] = 2;
        }
        for (int i = 0; i < count1; i++) {
            arr[idx--] = 1;
        }
        while (idx >= 0) {
            arr[idx--] = 0;
        }
        return arr;
    }

    public static void main(String args[]) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        System.out.println("Using Sorting: " + Arrays.toString(usingSorting(arr)));
        System.out.println("Using Count element: " + Arrays.toString(usingCountElement(arr)));

        int[] arr1 = {0, 1, 2, 0, 1, 2};
        System.out.println("Using Sorting: " + Arrays.toString(usingSorting(arr1)));
        System.out.println("Using Count element: " + Arrays.toString(usingCountElement(arr1)));
    }
}


import java.util.Arrays;

public class J02Sort012 {

    //Using Sorting
    public static int[] usingSorting(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String args[]) {
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        System.out.println("Using Sorting: " + Arrays.toString(usingSorting(arr)));

        int[] arr1 = {0, 1, 2, 0, 1, 2};
        System.out.println("Using Sorting: " + Arrays.toString(usingSorting(arr1)));
    }
}

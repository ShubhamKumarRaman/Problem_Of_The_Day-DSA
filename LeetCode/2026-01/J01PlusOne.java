
import java.util.Arrays;

public class J01PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String args[]) {
        int[] digits = {1, 2, 3};
        int[] result = plusOne(digits);
        System.out.println("Result: " + Arrays.toString(result));

        int[] digits2 = {9,9,9};
        result = plusOne(digits2);
        System.out.println("Result: "+Arrays.toString(result));
    }
}

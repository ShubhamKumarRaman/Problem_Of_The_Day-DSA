
public class J04FourDivisors {

    //Approach 1
    public static int sumFourDivisor(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += sumDivisors(n);
        }
        return sum;
    }

    public static int sumDivisors(int num) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
                sum += i;
            }
        }
        return count == 4 ? sum : 0;
    }

    //Approach 2
    public static int sumFourDivisors(int[] nums) {
        int result = 0;

        for (int n : nums) {
            result += findSumDivisor(n);
        }
        return result;
    }

    public static int findSumDivisor(int num) {
        int divisors = 0;
        int sum = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                int other = num / i;
                if (i == other) {
                    divisors++;
                    sum += i;
                } else {
                    divisors += 2;
                    sum += (i + other);
                }
            }
            if (divisors > 4) {
                return 0;
            }
        }
        return divisors == 4 ? sum : 0;
    }

    public static void main(String args[]) {
        int[] nums1 = {21, 4, 7};
        System.out.println(sumFourDivisor(nums1));
        System.out.println(sumFourDivisors(nums1));

        int[] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sumFourDivisor(nums2));
        System.out.println(sumFourDivisors(nums2));

        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println(sumFourDivisor(nums3));
        System.out.println(sumFourDivisors(nums3));
    }
}

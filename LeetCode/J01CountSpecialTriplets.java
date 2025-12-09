package LeetCode;

// 3583. Counting Special Triplets

public class J01CountSpecialTriplets {

    // Approach 1 - Two pointer approach X Not working for frequency more than 1
    public static int usingTwoPointer(int[] nums) {
        int length = nums.length;
        int count = 0;
        for (int i = 1; i < length - 1; i++) {
            boolean foundLeft = false;
            boolean foundRight = false;
            // Left Search
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] == nums[i] * 2) {
                    foundLeft = true;
                    break;
                }
            }

            if (foundLeft) {
                // Right Search
                for (int j = i + 1; j < length; j++) {
                    if (nums[j] == nums[i] * 2) {
                        foundRight = true;
                        break;
                    }
                }
            }
            count = (foundRight) ? count + 1 : count;
        }
        return count;
    }

    // Approach 2 - using count frequency
    public static int usingCountFrequency(int[] nums) {
        int length = nums.length;
        int count = 0;
        for (int i = 1; i < length - 1; i++) {
            int leftCount = 0;
            int rightCount = 0;
            // Count left frequency
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] == nums[i] * 2) {
                    leftCount++;
                }
            }

            if (leftCount > 0) {
                // Count right frequency
                for (int j = i + 1; j < length; j++) {
                    if (nums[j] == nums[i] * 2) {
                        rightCount++;
                    }
                }
            }

            count += leftCount * rightCount;
        }
        return count;
    }

    public static void main(String args[]) {
        int[] nums = { 6, 3, 6 };
        System.out.println("Using Two Pointer: " + usingTwoPointer(nums));
        System.out.println("Using Count Frequency: " + usingCountFrequency(nums));

        int[] nums2 = { 8, 4, 2, 8, 4 };
        System.out.println("Using Two Pointer: " + usingTwoPointer(nums2));
        System.out.println("Using Count Frequency: " + usingCountFrequency(nums2));

        int[] nums3 = { 84, 2, 93, 1, 2, 2, 26 };
        System.out.println("Using Two Pointer: " + usingTwoPointer(nums3));
        System.out.println("Using Count Frequency: " + usingCountFrequency(nums3));
    }
}

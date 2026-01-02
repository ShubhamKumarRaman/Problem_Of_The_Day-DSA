
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class J02NRepeatedElement {

    //Using Sorting
    public static int usingSorting(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 1, digit = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == digit) {
                count++;
            } else {
                digit = nums[i];
                count = 1;
            }
            if (count == n / 2) {
                return nums[i];
            }
        }
        return -1;
    }

    //Using Hashtable
    public static int usingHashTable(int[] nums) {
        int length = nums.length / 2;
        Hashtable<Integer, Integer> freq = new Hashtable<>();

        //Count frequency of each element
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        //Search for n frequency
        for (Integer key : freq.keySet()) {
            if (freq.get(key) == length) {
                return key;
            }
        }
        return -1;
    }

    //Using Set
    public static int usingSet(int[] nums){
        Set<Integer> set = new HashSet<>();

        for(int i: nums){
            if(!set.add(i)){
                return i;
            }
        }
        return nums[nums.length-1];
    }

    public static void main(String args[]) {
        int[] nums = {5, 1, 5, 2, 5, 3, 5, 4};
        System.out.println("Result: " + usingSorting(nums));
        System.out.println("Using Hashtable: " + usingHashTable(nums));
        System.out.println("Using Set: "+usingSet(nums));
        
        int[] nums2 = {1, 2, 3, 3};
        System.out.println("Result: " + usingSorting(nums2));
        System.out.println("Using HashTable: " + usingHashTable(nums2));
        System.out.println("Using Set: "+usingSet(nums2));
        
        int[] nums3 = {2, 1, 2, 5, 3, 2};
        System.out.println("Result: " + usingSorting(nums3));
        System.out.println("Using HashTable: " + usingHashTable(nums3));
        System.out.println("Using Set: "+usingSet(nums3));
    }
}

import java.util.*;
import java.io.*;

class TwoSum {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int target = 5;


        int [] result = solveTwoSum(nums,target);
        System.out.println(Arrays.toString(result));

    }

    public static int[] solveTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
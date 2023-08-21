package _01_two_sum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] array = new int[]{2,7,11,15};
        int target = 9;
        System.out.println(twoSum(array, target));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> indexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int dif = target - nums[i];
            if (indexes.containsKey(dif)) {
                result[0] = indexes.get(dif);
                result[1] = i;
            }
            indexes.put(nums[i], i);
        }
        return result;
    }

    // succesfull, 2nd place
//    public static int[] twoSum(int[] nums, int target) {
//        int[] result = new int[2];
//        for (int i = 0; i < nums.length; i++){
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    result[0] = i;
//                    result[1] = j;
//                }
//            }
//        }
//        return result;
//    }


//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    You can return the answer in any order.
//
//    Example 1:
//    Input: nums = [2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


}
